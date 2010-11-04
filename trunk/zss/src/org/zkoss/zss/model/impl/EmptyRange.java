/* EmptyRange.java

	Purpose:
		
	Description:
		
	History:
		Oct 28, 2010 5:48:49 PM, Created by henrichen

Copyright (C) 2010 Potix Corporation. All Rights Reserved.
*/

package org.zkoss.zss.model.impl;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.zkoss.zss.model.Areas;
import org.zkoss.zss.model.FormatText;
import org.zkoss.zss.model.Range;

/**
 * Class to represent an empty Range.
 * @author henrichen
 */
public class EmptyRange implements Range {

	@Override
	public void autoFill(Range dstRange, int fillType) {
	}

	@Override
	public void borderAround(BorderStyle lineStyle, String color) {
	}

	@Override
	public void clearContents() {
	}

	@Override
	public void copy(Range dstRange) {
	}

	@Override
	public void delete(int shift) {
	}

	@Override
	public void fillDown() {
	}

	@Override
	public void fillLeft() {
	}

	@Override
	public void fillRight() {
	}

	@Override
	public void fillUp() {
	}

	@Override
	public Areas getAreas() {
		return new AreasImpl();
	}

	@Override
	public Range getCells(int row, int col) {
		return this;
	}

	@Override
	public int getColumn() {
		return 0;
	}

	@Override
	public Range getColumns() {
		return this;
	}

	@Override
	public long getCount() {
		return 0L;
	}

	@Override
	public Range getDependents() {
		return this;
	}

	@Override
	public Range getDirectDependents() {
		return this;
	}

	@Override
	public String getEditText() {
		return null;
	}

	@Override
	public Sheet getSheet() {
		return null;
	}

	@Override
	public FormatText getFormatText() {
		return null;
	}

	@Override
	public Hyperlink getHyperlink() {
		return null;
	}

	@Override
	public RichTextString getRichEditText() {
		return null;
	}

	@Override
	public int getRow() {
		return 0;
	}

	@Override
	public Range getRows() {
		return this;
	}

	@Override
	public RichTextString getText() {
		return null;
	}

	@Override
	public void insert(int shift, int copyOrigin) {
	}

	@Override
	public void merge(boolean across) {
	}

	@Override
	public void move(int nRow, int nCol) {
	}

	@Override
	public void pasteSpecial(int pasteType, int operation, boolean SkipBlanks,
			boolean transpose) {
	}

	@Override
	public void pasteSpecial(Range dstRange, int pasteType, int pasteOp,
			boolean skipBlanks, boolean transpose) {
	}

	@Override
	public void setBorders(short borderIndex, BorderStyle lineStyle,
			String color) {
	}

	@Override
	public void setColumnWidth(int char256) {
	}

	@Override
	public void setDisplayGridlines(boolean show) {
	}

	@Override
	public void setEditText(String txt) {
	}

	@Override
	public void setHidden(boolean hidden) {
	}

	@Override
	public void setHyperlink(int linkType, String address, String display) {
	}

	@Override
	public void setRichEditText(RichTextString txt) {
	}

	@Override
	public void setRowHeight(int points) {
	}

	@Override
	public void setStyle(CellStyle style) {
	}

	@Override
	public void sort(Range rng1, boolean desc1, Range rng2, int type,
			boolean desc2, Range rng3, boolean desc3, int header,
			int orderCustom, boolean matchCase, boolean sortByRows,
			int sortMethod, int dataOption1, int dataOption2, int dataOption3) {
	}

	@Override
	public void unMerge() {
	}

	@Override
	public Range getDirectPrecedents() {
		return this;
	}

	@Override
	public Range getPrecedents() {
		return this;
	}
}