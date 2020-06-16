import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;
public class ReadFile {
 
  public static void main(String[] args) {
    
    List <String> data = GetSymptoms();
    Iterator i = data.iterator();
    while(i.hasNext())
      System.out.println(i.next());
  }


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
        //System.out.println(data);
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