import java.io.IOException;
import java.io.*;

public class JavaWords {
    //Here is a class for task 1. In which we write words into one of created files.

    public static void wordsAreInFile () throws Exception {
        //Here we write words into the first *.txt file;
        String text = "Java world.";
                try  (FileOutputStream fos = new FileOutputStream ("C:\\Educational\\testFile1.txt")){
                    byte [] buffer = text.getBytes();
                    fos.write (buffer, 0, buffer.length);
                    System.out.println("Words were written in a file.");
                } catch (IOException ex){
                    System.out.println (ex.getMessage());
                }

    }



}
