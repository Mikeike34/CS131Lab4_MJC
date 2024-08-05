import java.util.Scanner;
import java.io.*;
public class FileProcessor {
	
	private String fileName;
	private int stringLength;
	private stringList ArrayList<String>;
	private Scanner input;
	
	
	
	
	public FileProcessor(String fileName, int stringLength) {
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(fr);
			reader.close();
		}//end try
		catch(StringTooLongException e){
			System.out.println(e.getMessage());
		}//end catch
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}//end catch
		
			
	}//end empty-argument constructor
	
	public int getArrayListSize() {
		int size = ArrayList.size();
		return size;
	}//end getArrayListSize
	
	public void processFile() {
		
		
	}//end processFile

	public String getFileName() {
		return fileName;
	}//end getFileName

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}//end setFileName

	public int getStringLength() {
		return stringLength;
	}//end getStringLength

	public void setStringLength(int stringLength) {
		if(stringLength <5) {
			this.stringLength = 5;
		}//end if
		else {
		this.stringLength = stringLength;
		}//end else
	}//end setStringLength
	
	

}//end class
