package com.json.productdetails;

public class NutritionFacts {
    private String id;
    private String value;
    private boolean offset;
    private int colSpan;
    private String align;
    private boolean isLine;
    private int lineHeight;
    private boolean isLineBlack;

    public NutritionFacts() {
    }

    public NutritionFacts(String id, String value, boolean offset, int colSpan, String align, boolean isLine, int lineHeight, boolean isLineBlack) {
        this.id = id;
        this.value = value;
        this.offset = offset;
        this.colSpan = colSpan;
        this.align = align;
        this.isLine = isLine;
        this.lineHeight = lineHeight;
        this.isLineBlack = isLineBlack;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isOffset() {
        return offset;
    }

    public void setOffset(boolean offset) {
        this.offset = offset;
    }

    public int getColSpan() {
        return colSpan;
    }

    public void setColSpan(int colSpan) {
        this.colSpan = colSpan;
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public boolean isLine() {
        return isLine;
    }

    public void setLine(boolean line) {
        isLine = line;
    }

    public int getLineHeight() {
        return lineHeight;
    }

    public void setLineHeight(int lineHeight) {
        this.lineHeight = lineHeight;
    }

    public boolean isLineBlack() {
        return isLineBlack;
    }

    public void setLineBlack(boolean lineBlack) {
        isLineBlack = lineBlack;

    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                ", offset=" + offset +
                ", colSpan=" + colSpan +
                ", align='" + align + '\'' +
                ", isLine=" + isLine +
                ", lineHeight=" + lineHeight +
                ", isLineBlack=" + isLineBlack +
                '}';
    }

}
