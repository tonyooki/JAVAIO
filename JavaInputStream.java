package JAVAIO;
import java.io.*;
public class JavaInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="f:\\test1\\demo1.txt";
		FileOutputStream os=null;
		try{
			os=new FileOutputStream(path);
			os.write("i love coding madafucker!".getBytes());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				os.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
