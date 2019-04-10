package com.hlic.base.pojo.vo;

public class ResultVo {

    private int F_CODE;
    private String Message;
    public int getF_CODE() {
        return F_CODE;
    }
    public void setF_CODE(int f_CODE) {
        F_CODE = f_CODE;
    }
    public String getMessage() {
        return Message;
    }
    public void setMessage(String message) {
        Message = message;
    }
    @Override
    public String toString() {
        return "ResultVo [F_CODE=" + F_CODE + ", Message=" + Message + "]";
    }
    
}
