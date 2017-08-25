package tae.log;

import info.monitorenter.cpdetector.io.ASCIIDetector;
import info.monitorenter.cpdetector.io.CodepageDetectorProxy;
import info.monitorenter.cpdetector.io.JChardetFacade;
import info.monitorenter.cpdetector.io.ParsingDetector;
import info.monitorenter.cpdetector.io.UnicodeDetector;

import java.io.File;

public class FileEncode {
	  public static void getFileEncode() {
	        String charsetName = null;
	        String path = "D:\\tae.log.2017-07-27";
	        File file = new File(path);
	        try {
	            CodepageDetectorProxy detector = CodepageDetectorProxy.getInstance();
	            detector.add(new ParsingDetector(false));
	            detector.add(JChardetFacade.getInstance());
	            detector.add(ASCIIDetector.getInstance());
	            detector.add(UnicodeDetector.getInstance());
	            java.nio.charset.Charset charset = null;
	            charset = detector.detectCodepage(file.toURI().toURL());
	            if (charset != null) {
	                charsetName = charset.name();
	          
	            } else {
	                charsetName = "UTF-8";
	            }
	            System.out.println("文件的字符集格式是："+charsetName);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	  public static void main(String[] args) {
		  getFileEncode();
	}

}
