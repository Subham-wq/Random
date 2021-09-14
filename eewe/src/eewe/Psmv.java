package eewe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Psmv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream input=new FileInputStream("C:\\Users\\USER\\Documents\\Java Project files\\abc.txt");
			int i=0;
		  while((i=input.read())!=-1) {
				System.out.print((char)i);
				Thread.sleep(400);
		  }	
		  input.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String s=sc.nextLine();
		try {
			FileOutputStream input2=new FileOutputStream("C:\\Users\\USER\\Documents\\Java Project files\\Personal information");
		    byte b []=s.getBytes();
		    input2.write(b);
		    input2.flush();
		    input2.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			FileInputStream input3=new FileInputStream("C:\\Users\\USER\\Documents\\Java Project files\\Personal information");
	    System.out.print("Hello " );
		int j=0;
		while((j=input3.read())!=-1){
			System.out.print((char)j);
		}
		System.out.print("\n");
		FileInputStream f=new FileInputStream("C:\\Users\\USER\\Documents\\Java Project files\\note.txt");
		int l=0;
		while((l=f.read())!=-1) {
			System.out.print((char)l);
			Thread.sleep(300);
		}
		
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}

}
