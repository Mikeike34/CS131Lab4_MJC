import java.util.*;
import java.io.*;
public class FileProcessor {
	
	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList = new ArrayList<String>();
	private Scanner input;
	
	
	
	
	public FileProcessor(String fileName, int stringLength) {
		setFileName(fileName);
		setStringLength(stringLength);
				
	}//end preferred constructor
	
	public void processFile() {
		try {
			input = new Scanner(new File(fileName));
			String line;
			while(input.hasNext()) {
				line = input.nextLine();
				if(line.length()<=stringLength) {
					stringList.add(line);
				}//end if
				else {
					System.out.println("String is too long: "+line);
				}//end else
			}//end while
			input.close();
		}//end try
		catch(FileNotFoundException e){
			System.out.println("File not found: "+e.getMessage());
		}//end catch
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
	
	public int getArrayListSize() {
		return stringList.size();
	}//end getArrayListSize

	@Override
	public String toString() {
		return "FileProcessor [fileName=" + fileName + ", stringLength=" + stringLength + "]";
	}//end toString
	
	

}//end class
