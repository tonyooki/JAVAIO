package JAVAIO;
import java.io.*;

public class JavaIOTextCopy {
	
	public static void main(String[] args) {
		String pathFrom="f:\\test1\\demo3.txt";
		String pathTo="f:\\test2\\demo3.txt";
		FileReader r=null;
		FileWriter w=null;
		int temp=0;
		char[] ch=new char[1024];
		try{
			r=new FileReader(pathFrom);
			w=new FileWriter(pathTo);
			while((temp=r.read(ch))!=-1){
				w.write(new String(ch,0,temp));
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(w!=null){
					w.close();
				}
				if(r!=null){
					r.close();
				}
			}catch(IOException e){e.printStackTrace();}
			
		}
		
		
	

	}

}
