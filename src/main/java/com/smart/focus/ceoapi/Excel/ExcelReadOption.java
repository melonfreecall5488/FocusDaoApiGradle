package com.smart.focus.ceoapi.Excel;

public class ExcelReadOption {
    /**
     * 엑셀파일의 경로
     */
    private String filePath;

    /**
     * 추출할 컬럼 명
     */
    // private List<String> outputColumns;
    private String startOutputColumn;
    private String endOutputColumn;

    /**
     * 추출을 시작할 행 번호
     */
    private String[] chrckHeadName;
    private int headRow; // file적합성검토
    private int startRow;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public boolean isEnableColumn(String columnName) {
        if (this.startOutputColumn.length() == 1 && this.endOutputColumn.length() == 1) {
            // if(this.startOutputColumn.compareTo(columnName) <=0 &&
            // this.endOutputColumn.compareTo(columnName) <=0)
            if (columnName.compareTo(this.startOutputColumn) >= 0 && columnName.compareTo(this.endOutputColumn) <= 0)
                return true;
        } else if (this.startOutputColumn.length() == 1 && this.endOutputColumn.length() == 2) {
            if (columnName.length() == 1)
                return true;
            // else if(this.endOutputColumn.compareTo(columnName) <=0)
            else if (columnName.compareTo(this.endOutputColumn) <= 0)
                return true;
        } else if (this.startOutputColumn.length() == 1 && this.endOutputColumn.length() == 3) {

        }
        return false;
    }

    public void setOutputColumns(String start, String end) {

        this.startOutputColumn = start;
        this.endOutputColumn = end;
    }

    public int getStartRow() {
        return startRow;
    }

    public int getHeadRow() {
        return headRow;
    }

    public void setHeadRowStartRow(int headRow, int startRow) {
        this.startRow = startRow;
        this.headRow = headRow;
    }

    public void setCheckHeadName(String headName)// ,로구분
    {
        this.chrckHeadName = headName.split(",");
    }

    public String[] getCheckHeadName() {
        return this.chrckHeadName;
    }

}
