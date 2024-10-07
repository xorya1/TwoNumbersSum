import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import java.io.InputStream;
import java.io.OutputStream;

import com.sun.xml.internal.fastinfoset.util.ValueArray;


public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ServerSocket ser=new ServerSocket(4523);
			System.out.println("j'attend des clients");
			Socket s=ser.accept();
			OutputStream out=s.getOutputStream();
		    InputStream in=s.getInputStream();
		    InputStreamReader inre=new InputStreamReader(in);
			BufferedReader bre=new BufferedReader(inre);
			PrintWriter prt=new PrintWriter(out,true);
			while(true){
				
				
				
				float x=Float.parseFloat(bre.readLine());
				float y=Float.parseFloat(bre.readLine());
				float res=x+y;
			
				prt.println((Float. toString(res)));
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
