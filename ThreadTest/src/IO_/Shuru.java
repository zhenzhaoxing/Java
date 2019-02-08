package IO_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;




public class Shuru {

	
	
	public static void read(File file) throws IOException{
	
	FileOutputStream out = new FileOutputStream("C:\\cd\\a.txt");
			FileInputStream in;
			
				in = new FileInputStream(file);
		
			int len=0;
			//需要把byte转变成 字符才能使用
			byte[] b = new byte[1024]; 
			
		    while((len=in.read(b)) >=0){//把数据存在b里
		    	//String string = new String(b,0,len);
		    	//System.out.println(string);
		    	out.write(b, 0, len);
		    	System.out.println("succes");
		    }
				in.close();
			
		
		
		
		
	}
	
	
	
	
	
        public static void write(File file) throws IOException {
	
           
	                          FileOutputStream out = new FileOutputStream(file);
	                        
	                          String str ="zhenzhaoxing";
	                          byte[] h = str.getBytes();
	                      int len =0;
	                          out.write(h, 0, h.length);
	                      
	                      out.flush();
	                      out.close();
        }
	

	
	
	
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		File file = new File("C:\\cd\\b.txt");
		
		try {
			read(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
			//write(file);
	
	//	byte[] b = {(byte)0x33,(byte)0x43};
//		String s ="3";
//		byte[] cs = s.getBytes();
//		System.out.println(s.getBytes());
	//System.out.println(new String(b,0,b.length));
	}
	
	

	
}
