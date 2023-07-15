import java.io.File;

public class DeleteDirectory {
    //Here is a class for task 1.
    //Here is a class which deletes the directory;

    public static void directoryIsDeleted () throws Exception{
        String directoryPath = "C:\\Educational";

        File toDeletion = new File (directoryPath);
        if (toDeletion.exists()) {
            toDeletion.delete();
            System.out.println("Here we deleted a directory. A first task is done!");
        } else {
            System.out.println("A program can't locate directory");
        }


    }

}
