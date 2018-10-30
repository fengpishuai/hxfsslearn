package com.hlic.base.process.task;

import java.io.File;

import com.hlic.base.process.context.Config;
import com.hlic.utils.ResourcesUtil;

public class TaskJob {

    public void deleteImportExcel() {  
        System.out.println("任务进行中。。。 ");  
        //String url ="d:/upload/linshi/";
        String url = ResourcesUtil.getValue(Config.SYSTEM, "importexcelpath");
        File file = new File(url);  
        if(file.isDirectory()) {  
             File[] childFilePaths = file.listFiles();  
             for(File childFile : childFilePaths){    
                 System.out.println("删除："+childFile.getName());  
                 childFile.delete();  
             }    
        }  
    }  
}
