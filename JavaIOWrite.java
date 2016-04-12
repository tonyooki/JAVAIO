package JAVAIO;
import java.io.*;

public class JavaIOWrite {
	
	public static void main(String[] args) {
		FileWriter w=null;
		String path="f:\\test1\\demo3.txt";
		try{
			w=new FileWriter(path);
			w.write("here we go man!");
			w.flush();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(w!=null){
					w.close();
			}
		}catch(IOException e){e.printStackTrace();}
		}
	}

}
