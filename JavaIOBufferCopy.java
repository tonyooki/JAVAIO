package JAVAIO;
import java.io.*;

public class JavaIOBufferCopy {
	public static void main(String[] args){
		String pathdoc="f:\\test1\\demo3.txt";
		String pathcopy="f:\\test2\\demo2.txt";
		FileReader r=null;
		FileWriter w=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		String line=null;
		try{
			r=new FileReader(pathdoc);
			w=new FileWriter(pathcopy);
			br=new BufferedReader(r);
			bw=new BufferedWriter(w);
			while((line=br.readLine())!=null){
				bw.write(line);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				br.close();
				bw.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
	}
}
