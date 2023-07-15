import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    //Here is a class for the task 1, for creating 2 files in the created folder;

    public static void filesCreating () throws IOException {
        Path testFileOne = Files.createFile (Paths.get ("C:\\Educational\\testFile1.txt"));
        Path testFileTwo = Files.createFile(Paths.get ("C:\\Educational\\testFile2.txt"));


    }

}
