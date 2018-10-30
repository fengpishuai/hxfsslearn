package com.hlic.base.process.result;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据查询列表结果
 * @author Thinkpad
 *
 */
public class DataGridResultInfo {

    public DataGridResultInfo(){}
    public DataGridResultInfo(ResultInfo resultInfo){
        this.resultInfo = resultInfo;
    }
    
    //操作结果信息
    private ResultInfo resultInfo;
    
    //总条数
    private int totals;
    
    //当前页
    private int page;
    
    //总记录数
    private long records;
    
    //结果集
    private List rows = new ArrayList();
    
    //总计告诉footer
  //  private List footer = new ArrayList();

    /*public ResultInfo getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(ResultInfo resultInfo) {
        this.resultInfo = resultInfo;
    }*/

  
    public List getRows() {
        return rows;
    }

    public int getTotals() {
        return totals;
    }
    public void setTotals(int totals) {
        this.totals = totals;
    }
    public void setRows(List rows) {
        this.rows = rows;
    }
    /*public List getFooter() {
        return footer;
    }
    public void setFooter(List footer) {
        this.footer = footer;
    }*/
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public long getRecords() {
        return records;
    }
    public void setRecords(long l) {
        this.records = l;
    }
    
}
