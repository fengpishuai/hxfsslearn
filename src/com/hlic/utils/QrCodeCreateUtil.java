package com.hlic.utils;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class QrCodeCreateUtil {
	/**
      * 生成包含字符串信息的二维码图片
      * @param outputStream 文件输出流路径
      * @param content 二维码携带信息
      * @param qrCodeSize 二维码图片大小
      * @param imageFormat 二维码的格式
      * @throws WriterException 
      * @throws IOException 
      */
     public static void createQrCode(OutputStream outputStream, String content, int qrCodeSize, String imageFormat) throws WriterException, IOException{  
    	 //设置二维码纠错级别ＭＡＰ
         Hashtable<EncodeHintType, Object> hintMap = new Hashtable<EncodeHintType, Object>();  
         hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);  // 矫错级别
         hintMap.put(EncodeHintType.CHARACTER_SET, "utf-8");
         //页面大小宽度
         hintMap.put(EncodeHintType.MARGIN, 2); 
         QRCodeWriter qrCodeWriter = new QRCodeWriter();  
         //创建比特矩阵(位矩阵)的QR码编码的字符串  
         BitMatrix byteMatrix = qrCodeWriter.encode(content, BarcodeFormat.QR_CODE, qrCodeSize, qrCodeSize, hintMap);  
         MatrixToImageWriter.writeToPath(byteMatrix, imageFormat, new File("d:\\qrcode.jpg").toPath());
     }  
       
     /**
      * 读二维码并输出携带的信息
      */
     public static void readQrCode(InputStream inputStream) throws IOException{  
         //从输入流中获取字符串信息
         BufferedImage image = ImageIO.read(inputStream);  
         //将图像转换为二进制位图源
         LuminanceSource source = new BufferedImageLuminanceSource(image);  
         BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));  
         QRCodeReader reader = new QRCodeReader();  
         Result result = null ;  
         try {
          result = reader.decode(bitmap);
         } catch (ReaderException e) {
             e.printStackTrace();  
         }
         System.out.println(result.getText());  
     }
     public static void main(String[] args) throws IOException, WriterException {  
      
    	 //QrCodeCreateUtil.createQrCode(new FileOutputStream(new File("d:\\qrcode.jpg")), "http://192.168.232.128:8080/hxfsslearn/index/main.action", 150, "png");
         readQrCode(new FileInputStream(new File("d:\\4.png")));  
     }
}
