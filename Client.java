import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket sc=new Socket("localhost",4523);
			OutputStream out=sc.getOutputStream();
			InputStream in=sc.getInputStream();
			InputStreamReader inre=new InputStreamReader(in);
			BufferedReader bre=new BufferedReader(inre);
			PrintWriter prt=new PrintWriter(out,true);
			Scanner lire=new Scanner(System.in);
			
			while(true){
				System.out.println("Donner le premier nombre");
				String a=lire.next();
				prt.println(a);
				
				System.out.println("Donner le deuxieme nombre");
				String b=lire.next();
				prt.println(b);
				
				String res=bre.readLine();
				
				System.out.println("La somme est: "+res);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
