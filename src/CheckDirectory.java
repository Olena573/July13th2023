
import java.io.File;
import java.io.IOException;

public class CheckDirectory {
    //Here is a class for task 1.
    // here we check if the directory is created;
   public static void isDirectory ( ) throws IOException {
       String directoryPath = "C:\\Educational";
       File file = new File (directoryPath);

       if (file.isDirectory()){
           System.out.println ("Directory exists.");
           } else {
           System.out.println ("Directory does not exist.");
       }
   }

}
