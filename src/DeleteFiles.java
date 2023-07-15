
import java.io.*;
public class DeleteFiles   {
    //Here is a class for task 1. In which we delete both files.

    public static void filesAreDeleted () throws Exception{

        File firstFile = new File ("C:\\Educational\\testFile1.txt");
        if (firstFile.exists()) {
            firstFile.delete();
            System.out.println("Here we deleted a first file.");
        } else {
            System.out.println("Can't locate a file for deletion.");
        }

        File secondFile = new File ("C:\\Educational\\testFile2.txt");
        if (secondFile.exists()) {
            secondFile.delete();
            System.out.println("Here we deleted a second file.");
        } else {
            System.out.println("Can't locate a second file for deletion.");
        }

    }

}
