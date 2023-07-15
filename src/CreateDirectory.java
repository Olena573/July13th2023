import java.io.File;
import java.io.IOException;

class CreateDirectory {
    //Here is a class for the task 1, for creating a folder.
    public static void directoryCreating () throws IOException {
        File someFile = new File("C:\\Educational");
        boolean createDir = someFile.mkdir();
        if (createDir) {
            System.out.println("Directory has been created successfully");
        } else {
            System.out.println("Directory cannot be created");
        }
    }
}




