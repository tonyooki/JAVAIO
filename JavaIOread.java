package JAVAIO;
import java.io.*;

public class JavaIOread {
	public static void main(String[] args) {
	String path="f:\\Test1\\demo3.txt";
	FileReader r=null;
	char[] ch=new char[1024];
	int temp=0;
	try{
		r=new FileReader(path);
		while((temp=r.read(ch))!=-1){
			System.out.print(new String(ch,0,temp));
		}
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		if(r!=null){
			try{
				r.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	}

}
