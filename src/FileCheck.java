import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileCheck {
    //Here is a class for task 1. In which we check if 2 files were created.
    public static void filesAreChecked () throws IOException {
        System.out.println("Lets check files. Were 2 *.xt files created?");
        System.out.println(Files.exists(Paths.get("C:\\Educational\\testFile1.txt")));
        System.out.println(Files.exists(Paths.get("C:\\Educational\\testFile2.txt")));


    }

}
