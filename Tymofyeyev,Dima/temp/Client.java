package reversal;

import java.io.*;
import java.net.Socket;

public class Client {
	/* The commands for the database are as follows:
	 * "db size": No args
	 * "db select <arg1> <arg2>": Two integer args
	 * "db size": No args
	 * "db get": No args
	 * "db set <arg1>": One integer arg
	 * "db t": No args
	 * 
	 * In order to test commands on the database, send the commands, each seperated by a 
	 * semicolon. The server will run this and return a string of the things returned after each
	 * command, followed by a semicolon. The method below will do this for you, taking a String[]
	 * of commands and returning the string of things returned. If you want to do this in another
	 * language or write your own method, connect to 104.131.119.33:25565
	 */
	
	public static String testOnServer(String[] commands){
		String toTest = "";
		
		String output = "";
		
		for(String c : commands)
			toTest += c + ";";
		try{
			Socket skt = new Socket("104.131.119.33", 25565);
			
			skt.getOutputStream().write(toTest.getBytes());
			
			int curOut = skt.getInputStream().read();
			
			while(curOut != -1){
				output+= (char) curOut;
				curOut = skt.getInputStream().read();
			}
			
			skt.close();
		}catch(IOException e){
			System.out.println("Error connecting to server");
			e.printStackTrace();
		}
		
		return output;
	}
	
	public static void main(String[] args){
		String[] com = {"db size"};
		
		System.out.println(testOnServer(com));
	}
}
