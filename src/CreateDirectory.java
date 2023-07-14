import java.io.File;

class CreateDirectory {
    //Here is a class for the task 1, for creating a folder.
    public static void directoryCreating () {
        File someFile = new File("C:\\Educational");
        boolean createDir = someFile.mkdir();
        if (createDir) {
            System.out.println("Directory has been created successfully");
        } else {
            System.out.println("Directory cannot be created");
        }
    }
}




