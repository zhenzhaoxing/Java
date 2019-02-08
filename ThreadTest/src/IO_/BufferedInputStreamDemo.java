package IO_;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamDemo {

	
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("C:\\cd\\a.txt");
		BufferedInputStream  btf = new BufferedInputStream(in);

		//读取
		byte[] bys = new byte[1024];
		int len=0;
		while((len=btf.read(bys))!=-1){
			String string= new String(bys,0,len);
			System.out.println(string);
		}
		btf.close();
	}

}
