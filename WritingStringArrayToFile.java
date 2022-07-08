import java.io.BufferedWriter;
import java.io.FileWriter;

public class WritingStringArrayToFile {
   public static void main(String args[]) {
      String[] myArray = {"JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j"};
try{
      BufferedWriter writer = new BufferedWriter(new FileWriter("myFile.txt", false));
      for(int i = 0; i < myArray.length; i++) {
         writer.write(myArray[i].toString());
         writer.newLine();
      }
      writer.flush();
}catch(Exception ex){
 System.out.println("Error");
}
      System.out.println("Data Entered in to the file successfully");
   }
}