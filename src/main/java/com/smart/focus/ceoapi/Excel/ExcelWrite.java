package com.smart.focus.ceoapi.Excel;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.smart.focus.ceoapi.common.Log;

public class ExcelWrite {

	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private XSSFCellStyle textStyle;
	private XSSFCellStyle integerStyle;
	private XSSFCellStyle headStyle;
	private XSSFCellStyle headStyle2;
	private Map<String, String> cellStyle;
	DataFormat fmt;

	public void createWorkBook() {

		this.workbook = new XSSFWorkbook();
		this.sheet = workbook.createSheet();
		sheet.setDefaultColumnWidth(14);// 기본값.

		fmt = workbook.createDataFormat();
		textStyle = this.workbook.createCellStyle();
		integerStyle = this.workbook.createCellStyle();
		headStyle = this.workbook.createCellStyle();
		headStyle2 = this.workbook.createCellStyle();
		textStyle.setDataFormat(fmt.getFormat("@"));
		integerStyle.setDataFormat(fmt.getFormat("0"));

		headStyle.setFillForegroundColor(IndexedColors.LIGHT_ORANGE.getIndex());
		headStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		headStyle2.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
		headStyle2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		this.cellStyle = null;

	}

	public void setCellStyle(Map<String, String> cellStyle) {
		this.cellStyle = cellStyle;
	}

	public XSSFWorkbook xlsxWrite(String title, Map<String, Object> header, List<Map<String, Object>> list,
			List<String> remark) {
		int hasTitle = 0;
		if (title != null) {
			Font font = workbook.createFont();
			font.setBold(true);
			font.setFontHeightInPoints((short) 16);
			CellStyle style = workbook.createCellStyle();
			style.setFont(font);
			XSSFRow row = this.sheet.createRow(0);
			XSSFCell cell = row.createCell(0);
			cell.setCellStyle(style);
			cell.setCellValue(title);
			hasTitle = 2;
		}
		for (int i = -1; i < list.size(); i++) {
			short cellIndex = 0;
			XSSFRow row = this.sheet.createRow(i + 1 + hasTitle);
			for (String key : header.keySet()) {
				String cellType = "String";
				if (i >= 0 && this.cellStyle != null) {
					cellType = this.cellStyle.get(key);
				}
				Object item;
				if (i < 0) {
					item = header.get(key);
				} else {
					item = list.get(i).get(key);
				}

				String data = "";
				if (item != null)
					data = item.toString();
				// Log.Debug(data);

				XSSFCell cell = row.createCell(cellIndex++);
				if (item == null) {
					continue;
				} else if (cellType.equals("String") == false) {
					cell.setCellStyle(integerStyle);
					cell.setCellValue(Long.parseLong(data));
				} else {
					if (i == -1)
						cell.setCellStyle(headStyle);
					else
						cell.setCellStyle(textStyle);
					cell.setCellValue(data);
				}
			}
		}

		if (remark != null) {
			int row = list.size() + 5;

			for (int i = 0; i < remark.size(); i++) {
				XSSFRow xRow = this.sheet.createRow(row + i);
				XSSFCell cell = xRow.createCell(0);
				cell.setCellStyle(textStyle);
				cell.setCellValue(remark.get(i).toString());
			}
		}

		return this.workbook;

	}

	public XSSFWorkbook addHeader(Map<String, Object> header, List<String> remark, Integer startRow, int headColorChange)// 1
																																																												// base
	{

		short cellIndex = 0;
		XSSFRow row = this.sheet.createRow(startRow);
		for (String key : header.keySet()) {
			Object item;

			item = header.get(key);

			String data = "";
			if (item != null)
				data = item.toString();
			// Log.Debug(data);

			XSSFCell cell = row.createCell(cellIndex++);
			if (item == null) {
				continue;
			} else {
				if (cellIndex > headColorChange)
					cell.setCellStyle(headStyle2);
				else
					cell.setCellStyle(headStyle);

				cell.setCellValue(data);
			}

		}

		if (remark != null) {
			int remarkRow = startRow + 1;

			for (int i = 0; i < remark.size(); i++) {
				XSSFRow xRow = this.sheet.createRow(remarkRow + i);
				XSSFCell cell = xRow.createCell(0);
				cell.setCellStyle(textStyle);
				cell.setCellValue(remark.get(i).toString());
			}
		}

		return this.workbook;

	}

	public XSSFWorkbook getXSSFWorkbook() {
		return this.workbook;
	}

	public void closeWorkBook() {
		if (this.workbook != null)
			try {
				this.workbook.close();
			} catch (IOException e) {
				Log.Error(e.getMessage());
			}
	}

}
