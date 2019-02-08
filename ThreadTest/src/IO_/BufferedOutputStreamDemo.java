package IO_;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		// BufferedOutputStream(OutputStream out)
		// FileOutputStream fos = new FileOutputStream("bos.txt");
		// BufferedOutputStream bos = new BufferedOutputStream(fos);
		// ��д��
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("bos.txt"));

		// д����
		bos.write("hello".getBytes());

		// �ͷ���Դ
		bos.close();
	}
}
