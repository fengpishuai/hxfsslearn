package com.hlic.base.pojo.vo;

import java.io.Serializable;
import java.util.Date;

public class DeployVo implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String id;
    
    private String name;
    
    private Date deploymentTime;
    
    private String category;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeploymentTime() {
        return deploymentTime;
    }

    public void setDeploymentTime(Date deploymentTime) {
        this.deploymentTime = deploymentTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

   
}
