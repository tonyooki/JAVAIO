package JAVAIO;
import java.io.*;

public class JavaInputStreamtrue {
	public static void main(String[] args){
		String pathmp3="f:\\test2\\lalala.mp3";
		String pathcopy="f:\\test1\\hahaha.mp3";
		FileInputStream is=null;
		FileOutputStream os=null;
		BufferedInputStream bi=null;
		BufferedOutputStream bo=null;
		int temp=0;
		byte[] B=new byte[1024];
		try{
			is=new FileInputStream(pathmp3);
			os=new FileOutputStream(pathcopy);
			bi=new BufferedInputStream(is);
			bo=new BufferedOutputStream(os);
			while((temp=bi.read(B))!=-1){
				bo.write(B,0,temp);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				bi.close();
				bo.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	
}
