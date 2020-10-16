import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//ConsoleRoullete: is a popular casino game.This is a simple command
//	line version of the game

//Create a public class FileNameReader which is used to read
//	names from a file
class FileNameReader{
	
	//String fileLoc ;
	
	//Testing the git UI

	//Create an ArrayList reference variable
	private ArrayList<String> nameCollection;

	
	//Create a method that will be able to read from a file 
	//	store the names in an ArrayList data structure
	public void loadNames(){
		
		//Create a local variable
		String line;
	
		nameCollection = new ArrayList <String>();
		
	

		try{
			//Create a File Object to store the file
			//for processing
			File file = new File("C:\\Users\\iCafe03\\eclipse-workspace\\PlaySafeCounsouleRoulete.java\\src\\Names.txt");

			//Check if the file exist and that it is readable
			if(file.exists() && file.canRead()){

				//Create a BufferedReader object wraped around
				//	a FileReader object with file name
				BufferedReader fileReader = new BufferedReader(new FileReader(file));
			
				//read a line from the file
				line = fileReader.readLine();
		

				//enter a loop for iteration
				while(line != null){

					//add a name unto the local data structure
					nameCollection.add(line);	

					//read a line 
					line = fileReader.readLine();

				}//Closed While Loop
				
				fileReader.close();
			}}catch(IOException ioe){

			System.out.println("Opps: Seens like we hit an obstale");

		}//closed catched exteception

	}//closed method
	
	
	//fetchData :stores the names which have been collected
	//	into an ArrayList data Structure
	public ArrayList<String> fetchData(){

		return nameCollection;

	}//closed fetchData method

}//closed the FileNameReader class




public class ConsoleRoulette {
	
	
	public static void main(String ...args) {
		
		
		
	}
	

}
