import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteToFile{ 

  public static void main(String[] args) 
  { 

    List <String> symptomsSortedAndCount = CountAndSortSymptoms.CountAndSort();

    try 
    {  
          
      FileWriter myWriter = new FileWriter("result.out");
      for(String str:symptomsSortedAndCount)
      {
        myWriter.write(str+"\n");
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file result.out");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 