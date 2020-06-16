import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner; 
import java.util.*;
public class ReadFile {

	/**
	*Function that read line by line  the data from the symptoms.txt and then stock them in a List; which is returned  by the funtion
	**/
  public static  List<String>  GetSymptoms() 
  {
    
    List <String> listSymptoms = new ArrayList <String>(); 
    
    try
    {

      File myObj = new File("symptoms.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) 
      {
        String data = myReader.nextLine();
        listSymptoms.add(data);
      }
      myReader.close();

    } 
    catch (FileNotFoundException e) 
    {
      System.out.println("No file found !");
      e.printStackTrace();
    } 
      
    return listSymptoms;
  }

}