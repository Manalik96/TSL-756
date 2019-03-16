import java.io.FileReader;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CsvRead {
  @Test
  public void f()  throws Exception
  {
	  CSVReader CR=new CSVReader(new FileReader(".\\Data.csv"));
	  List<String[]> allData=CR.readAll();
	  
	  for (String rowData[]:allData) {
		  System.out.println(rowData[0]);
		  System.out.println(rowData[1]);
	  }
  }
}
