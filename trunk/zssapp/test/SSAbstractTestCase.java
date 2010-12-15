import org.junit.Test;
import org.zkoss.ztl.JQuery;
import org.zkoss.ztl.ZKClientTestCase;

import com.thoughtworks.selenium.Selenium;

/**
 * An abstract test case class for ZSS. You can just write your test action in your case which
 * extends this class.
 * @author Phoenix
 *
 */
public abstract class SSAbstractTestCase extends ZKClientTestCase {
    public SSAbstractTestCase() {
        target = Utils.getTarget();
        browsers = getBrowsers(Utils.getBrowsers());
        _timeout = Utils.getTimeout();
    }
    
    @Test(expected = AssertionError.class)
    public final void testCase() {
        for (Selenium browser : browsers) {
            try {
                start(browser);
                windowFocus();
                windowMaximize();
                executeTest();
            } finally {
                stop();
            }
        }
    }
    
    /**
     * 
     * @param col - Base on 0
     * @param row - Base on 0
     * @return A JQuery object of cell.
     */
    public JQuery getSpecifiedCell(int col, int row) {
        return jq("div.zscell[z\\\\.c=\"" + col + "\"][z\\\\.r=\"" + row + "\"] div");
    }
    
    /**
     * 
     * @param col - Base on 0
     * @return A JQuery object of column header.
     */
    public JQuery getColumnHeader(int col) {
        return jq("div.zstopcell[z\\\\.c=\"" + col + "\"] div");
    }
    
    /**
     * 
     * @param row - Base on 0
     * @return A JQuery object of row header.
     */
    public JQuery getRowHeader(int row) {
       return jq("div.zsleftcell[z\\\\.r=\"" + row + "\"] div"); 
    }
    
    public String getCellContent(JQuery cellLocator) {
        return cellLocator.text();
    }
    
    public void clickCell(JQuery cellLocator) {
        mouseDownAt(cellLocator, "1,2");
        waitResponse();
        mouseUpAt(cellLocator, "1,2");
        waitResponse();
    }
    
    public void rightClickCell(JQuery cellLocator) {
        mouseDownRightAt(cellLocator, "1,2");
        waitResponse();
        mouseUpRightAt(cellLocator, "1,2");
        waitResponse();
    }
    
    /**
     *  
     * @param column - Base on 0
     */
    public void rightClickColumnHeader(int column){    	
    	mouseDown(getColumnHeader(column));				
		waitResponse();
		mouseUp(getColumnHeader(column));
		waitResponse();
		mouseDown(getColumnHeader(column));
		waitResponse();
		mouseUp(getColumnHeader(column));
		waitResponse();
		contextMenuAt(getColumnHeader(column),"2,2");
		waitResponse();
    }
    
    /**
     * 
     * @param row : 0-based
     */
    public void rightClickRowHeader(int row){
		mouseDown(getRowHeader(row));
		waitResponse();
		mouseUp(getRowHeader(row));
		waitResponse();
		mouseDown(getRowHeader(row));
		waitResponse();
		mouseUp(getRowHeader(row));
		waitResponse();
		contextMenuAt(getRowHeader(row),"2,2");
		waitResponse();
    }
    
    /**
     * 
     * @param start: column number, 0-based
     * @param end: column number, 0-based
     */
    public void selectColumns(int start, int end){
		mouseDownAt(getColumnHeader(start),"2,2");
		waitResponse();
		mouseMoveAt(getColumnHeader(end),"2,2");
		waitResponse();
		mouseUpAt(getColumnHeader(end),"2,2");
    }

    /**
     * 
     * @param start: row number, 0-based
     * @param end: row number, 0-based
     */
    public void selectRows(int start, int end){
		mouseDownAt(getRowHeader(start),"2,2");
		waitResponse();
		mouseMoveAt(getRowHeader(end),"2,2");
		waitResponse();
		mouseUpAt(getRowHeader(end),"2,2");
    }

    /**
     * Actually executing test.<br />
     * Note: You also have to implement your validation in this method.
     */
    protected abstract void executeTest();
}