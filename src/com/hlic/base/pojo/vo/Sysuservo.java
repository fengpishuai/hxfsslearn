package com.hlic.base.pojo.vo;

public class Sysuservo {

    private int id;
    private String userid;
    private int iRow;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public int getiRow() {
        return iRow;
    }
    public void setiRow(int iRow) {
        this.iRow = iRow;
    }
    @Override
    public String toString() {
        return "Sysuservo [id=" + id + ", userid=" + userid + ", iRow=" + iRow
                + "]";
    }
    
}
