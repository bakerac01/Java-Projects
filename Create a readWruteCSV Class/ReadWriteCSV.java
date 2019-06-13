package edu.buffalostate.cis425.sp19.exercises.baker;


/*
* @author: Alan Baker
* 
* 
* don't forget comments
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer; 
public class ReadWriteCSV {
	// Put class properties here
	  // Add method, processInfile(), to open file and read here
	public static void processInFile() throws IOException{
		// open scanner
		Scanner fileIn = new Scanner(new File("C:\\Users\\Alan\\Documents\\Buff state\\Java\\cis425_io.txt"));
		 //loop that reads the data file then splits it at the "," character.  Then it pushes the data to the display table method once its split for formating.
		while (fileIn.hasNext()){ 
		
		String newline = fileIn.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(newline,",");
		String no = tokenizer.nextToken();
		String month = tokenizer.nextToken();
		String days = tokenizer.nextToken();
		displayTable(no,month,days);
		
		}
	fileIn.close();
	}
		
	  // add method, displayTable(), here to display the table
	public static void displayTable(String no, String month, String days) throws IOException{
		// table formating print statement
		System.out.print("|   " + no + "  |   " + month + "    | " + days + " |\n");
		
		
		
	}
	
	  // add method, writeOutfile(), here to open and write the data in reverse order to the new file
	public static void writeOutfile() throws IOException{
//output opening
		File fout = new File("C:\\Users\\Alan\\Documents\\Buff state\\Java\\cis425_new.txt");
		FileOutputStream fos = new FileOutputStream(fout);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		
		// input opening
		PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\Alan\\Documents\\Buff state\\Java\\cis425_new.txt"));
		FileReader fr = new FileReader("C:\\Users\\Alan\\Documents\\Buff state\\Java\\cis425_io.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		
		//loop that reads the file and flips it to print in reverse order.
		List <String> tmp = new ArrayList<String>();
		do{
			s = br.readLine();
			tmp.add(s);
		} while(s!=null);
		
		for(int i =tmp.size()-1;i>-1;i--) {
			
			bw.append(tmp.get(i));
			bw.newLine();
						
		}
		bw.close();
		writer.close();
		br.close();
	}
	  // add main() method here
	public static void main(String args[]) throws IOException  {
		System.out.print("--------------------------" + "\n| No   | Month Name | Days |" + "\n--------------------------\n" );
		processInFile();
		System.out.print("--------------------------");
		writeOutfile();
	}
}

