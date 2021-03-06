import java.util.*;

/**
*Function which use the List return by the function GetSymptoms() from the ReadFile class, sorted them and count their occurences 
**/


public class CountAndSortSymptoms{

	public  static  List<String> CountAndSort()
	{ 		

	 	List <String> listSymptoms = ReadFile.GetSymptoms();
    		HashSet<String> symptomsWithoutDuplicate = new HashSet<String>(listSymptoms);
    		List<String> symptomsSortedAndcount = new ArrayList<String>();
		for (String s : symptomsWithoutDuplicate)
		{
			symptomsSortedAndcount.add(s+ "="+ Collections.frequency(listSymptoms, s));
		}
		Collections.sort(symptomsSortedAndcount);
		return symptomsSortedAndcount;

      }			
}

