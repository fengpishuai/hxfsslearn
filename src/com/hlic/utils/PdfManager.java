package com.hlic.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.json.JSONArray;
import org.json.JSONObject;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfManager {
	public static File Pdf(ArrayList<String> imageUrllist,String mOutputPdfFileName) {  
        String TAG = "PdfManager";  
        Document doc = new Document(PageSize.A4, 20, 20, 20, 20);  
        try {  
            PdfWriter.getInstance(doc, new FileOutputStream(mOutputPdfFileName));  
            doc.open();  
            Image png1 = Image.getInstance(imageUrllist.get(0));
            for (int i = 0; i < imageUrllist.size(); i++) {  
                doc.newPage();  
                doc.add(new Paragraph("简单使用iText"));  
                png1 = Image.getInstance(imageUrllist.get(i));  
                float heigth = png1.getHeight();  
                float width = png1.getWidth();  
                int percent = getPercent2(heigth, width);  
                png1.setAlignment(Image.MIDDLE);  
                png1.scalePercent(percent+3);// 表示是原来图像的比例;  
                doc.add(png1);  
            }
            doc.close();
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (DocumentException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally{
        	doc.close();
        }
  
        File mOutputPdfFile = new File(mOutputPdfFileName);  
        if (!mOutputPdfFile.exists()) {  
            mOutputPdfFile.deleteOnExit();  
            return null;  
        }  
        return mOutputPdfFile;  
    }  
	/** 
     * 统一按照宽度压缩 这样来的效果是，所有图片的宽度是相等的，自我认为给客户的效果是最好的 
     * @param args 
     */  
    public static int getPercent2(float h, float w) {  
        int p = 0;  
        float p2 = 0.0f;  
        p2 = 530 / w * 100;  
        p = Math.round(p2);  
        return p;  
    }  
    //图片生成pdf
    public static boolean imgMerageToPdf(List<File> list, File file)throws Exception {
    	//3:通过宽高 ，实例化PDF文档对象。
    	Document document = new Document(PageSize.A4, 20, 20, 20, 20); 
    	
        PdfWriter pdfWr = PdfWriter.getInstance(document, new FileOutputStream(file));
    	try {
    		//1：对图片文件通过TreeMap以名称进行自然排序
            Map<Integer,File> mif = new TreeMap<Integer,File>();
            int count = 0;
            for(File f : list){
            	mif.put(count++, f);
            }
            
            document.open();
            //2：获取第一个Img的宽、高做为PDF文档标准
            ByteArrayOutputStream baos = null;
            InputStream is = null;
            Image image = null;
            //4：获取每一个图片文件，转为IMG对象。装载到Document对象中
            for(Entry<Integer,File> eif : mif.entrySet())
            {
              //4.1:读取到内存中
              baos = new ByteArrayOutputStream(2048*3);
              is = new FileInputStream(eif.getValue());
              for(int len;(len=is.read())!=-1;){
            	  baos.write(len); 
              }
              baos.flush();
              
              //4.2通过byte字节生成IMG对象
              image = Image.getInstance(baos.toByteArray());
              float heigth = image.getHeight();  
              float width = image.getWidth();  
              int percent = getPercent2(heigth, width);  
              image.setAlignment(Image.MIDDLE);  
              image.scalePercent(percent+3);// 表示是原来图像的比例; 
              
              //4.3：添加到document中
              document.add(image);
              //document.newPage();
              is.close();
              baos.close();
            }
		} catch (Exception e) {
			
		} finally{
			//5：释放资源
            document.close();
            pdfWr.close();
		}
    	return true;
    }
    
    public static boolean gridToPdf(){
    	
    	return true;
    }
    
    public static void getImgs(){
    	String ADD_URL = "http://localhost:8080/HXFSS/fileTransferDownloadApplyAction.do";
    	try {
            //创建连接
            URL url = new URL(ADD_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestProperty("accept", "application/json, text/javascript, */*");
            connection.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");

            connection.connect();

            //POST请求
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
            JSONObject sendData = new JSONObject();
            JSONObject filesObj = new JSONObject();
            JSONObject applyFiles = new JSONObject();
            
            filesObj.append("F_FILE_NAME", "影像1..png");
            filesObj.append("F_STORE_KEY", "g5/2017/08/15/E4A999D9D758706DDAC9E4004542353C.png");
            
            JSONArray fileArr = new JSONArray();
            fileArr.put(filesObj);
            applyFiles.append("F_FILES", fileArr);
            applyFiles.append("F_OBJECT", "CRS157-BX20161130092301159");
            applyFiles.append("F_TYPE", "0002");
            
            JSONArray applyArr = new JSONArray();
            applyArr.put(applyFiles);
            
            sendData.append("F_USER_ID", "10041194");
            sendData.append("F_ZIP", "0");
            sendData.append("F_APPLY_FILES", applyArr);


            out.writeBytes(sendData.toString());
            out.flush();
            out.close();

            //读取响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lines;
            StringBuffer sb = new StringBuffer("");
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                sb.append(lines);
            }
            System.out.println(sb);
            reader.close();
            // 断开连接
            connection.disconnect();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void getImgs1(){
    	String ADD_URL = "http://fssc-im.cfldpe.com:8180/HXFSS/fileTransferGetAccessToken.do";
    	try {
            //创建连接
            URL url = new URL(ADD_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            // 设置维持长连接
            connection.setRequestProperty("Connection", "Keep-Alive");
            // 设置文件字符集:
            connection.setRequestProperty("Charset", "UTF-8");
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestProperty("accept", "application/json, text/javascript, */*");
            connection.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");

            connection.connect();
           // System.out.println(connection.getResponseMessage());

            //POST请求
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
            //OutputStream  out = connection.getOutputStream();
            JSONObject sendData = new JSONObject();
            
            sendData.put("F_APP_ID", "KJPT");
            sendData.put("F_AUTH_CODE", "12345678");
            sendData.put("F_USER_ID", "10041194");
            sendData.put("F_USER_NAME", "");
            sendData.put("F_QUERY", "1");
            sendData.put("F_UPDATE", "1");
            sendData.put("F_DELETE", "1");
            sendData.put("F_UPLOAD", "1");
            sendData.put("F_DOWNLOAD", "1");
            
            String str = "jsondata:"+sendData.toString();

            out.writeBytes(str);
            out.flush();
            out.close();
            int resultCode=connection.getResponseCode();
            System.out.println(resultCode);
            //读取响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lines;
            StringBuffer sb = new StringBuffer("");
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                sb.append(lines);
            }
            System.out.println(sb);
            reader.close();
            // 断开连接
            connection.disconnect();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void getImgs2() throws HttpException, IOException{
    	String ADD_URL = "http://fssc-im.cfldpe.com:8180/HXFSS/fileTransferGetAccessToken.do";
    	JSONObject sendData = new JSONObject();
        
        sendData.put("F_APP_ID", "KJPT");
        sendData.put("F_AUTH_CODE", "12345678");
        sendData.put("F_USER_ID", "10041194");
        sendData.put("F_USER_NAME", "");
        sendData.put("F_QUERY", "1");
        sendData.put("F_UPDATE", "1");
        sendData.put("F_DELETE", "1");
        sendData.put("F_UPLOAD", "1");
        sendData.put("F_DOWNLOAD", "1");
        
        String str = "jsondata:"+sendData.toString();
    	byte[] requestBytes = str.getBytes("utf-8"); // 将参数转为二进制流
        HttpClient httpClient = new HttpClient();// 客户端实例化
        PostMethod postMethod = new PostMethod(ADD_URL);
        //设置请求头Authorization
       // postMethod.setRequestHeader("Authorization", "Basic " + authorization);
        // 设置请求头  Content-Type
        postMethod.setRequestHeader("Content-Type", "application/json");
        InputStream inputStream = new ByteArrayInputStream(requestBytes, 0, requestBytes.length);
        RequestEntity requestEntity = new InputStreamRequestEntity(inputStream,
                requestBytes.length, "application/json; charset=utf-8"); // 请求体
        postMethod.setRequestEntity(requestEntity);
        httpClient.executeMethod(postMethod);// 执行请求
        InputStream soapResponseStream = postMethod.getResponseBodyAsStream();// 获取返回的流
        byte[] datas = null;
        try {
            datas = readInputStream(soapResponseStream);// 从输入流中读取数据
        } catch (Exception e) {
            e.printStackTrace();
        }
        String result = new String(datas, "UTF-8");// 将二进制流转为String
        // 打印返回结果
        // System.out.println(result);

    }
    public static byte[] readInputStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        byte[] data = outStream.toByteArray();
        outStream.close();
        inStream.close();
        return data;
    }
    public static void fillTemplate()  throws BusinessException{
        // 模板路径
        String templatePath = "D://11.pdf";
        // 填充模版文件后生成的待签署的合同路径

        //TODO 地址
        // 文件名BORROWPROTOCOL+协议编号  
        String newPDFPath = "D://1.PDF";
        PdfReader reader;
        FileOutputStream out;
        ByteArrayOutputStream bos;
        PdfStamper stamper;

        try {
            out = new FileOutputStream(newPDFPath);
            // 读取pdf模板
            reader = new PdfReader(templatePath);
            bos = new ByteArrayOutputStream();
            stamper = new PdfStamper(reader, bos);
            AcroFields form = stamper.getAcroFields();

            //往pdf合同模版里面设置值  //mock
            //合同编号
            form.setField("F_DJBH", "11111111111111111111111111111111111111111");
            //甲方
            form.setField("F_ZDSJ", "1111");
            //...需要填充的其他表单域
            

            // 如果为false那么生成的PDF文件还能编辑，一定要设为true
            stamper.setFormFlattening(true);
            stamper.close();
            Document doc = new Document();
            PdfCopy copy = new PdfCopy(doc, out);

            doc.open();
            //pdf模版的页数
            int pagecount= reader.getNumberOfPages();
            for(int i=1 ;i<pagecount+1;i++){
                PdfImportedPage importPage = copy.getImportedPage(new PdfReader(bos.toByteArray()), i);
                copy.addPage(importPage);
            }
            doc.close();

        } catch (IOException e) {
            throw new BusinessException("生成合同模版失败,合同编号:");
        } catch (DocumentException e) {
            throw new BusinessException("生成合同模版失败,合同编号:");
        }

    }
    public static void main(String[] args) throws Exception {
    	/*String[] imgPath = {"D:\\fkdfile\\1.jpg","D:\\fkdfile\\2.jpg","D:\\fkdfile\\3.jpg","D:\\fkdfile\\4.jpg"};
    	
    	File file = null;
    	List<File> fileList = new ArrayList<File>();
    	for(String path : imgPath){
    		file = new File(path);
        	if(file.exists()){
        		fileList.add(file);
        	}
    	}
    	
    	PdfManager.imgMerageToPdf(fileList, new File("F:\\","巴黎公社活动家传略.pdf"));*/
    	fillTemplate();
	}
}
