// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.File;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       // System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
     //   for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
      //      System.out.println("i = " + i);

        CreateDirectory newFolder = new CreateDirectory ();
        //Here we created a directory:
        newFolder.directoryCreating();
        // Here we check if it was created.
        CheckDirectory checkFolder = new CheckDirectory ();
        checkFolder.isDirectory();

        //Here we create 2 *.txt files:
        CreateFile newTwoFiles = new CreateFile ();
        newTwoFiles.filesCreating();
        // Here we check if they were created:
        FileCheck checkTwoFiles = new FileCheck ();
        checkTwoFiles.filesAreChecked();

        //here we write required words in the file:
        JavaWords writingWordsInFile = new JavaWords ();
        writingWordsInFile.wordsAreInFile();

        //Here we copy the input from one file into another:
        FileCopyingWords copyInputAndOutputStream = new FileCopyingWords ();

        copyInputAndOutputStream.wordsFromFirstFile( );

        //Here we delete both files;
        DeleteFiles letsDeleteTwoFiles = new DeleteFiles ();
        letsDeleteTwoFiles.filesAreDeleted();
        //Here we delete a folder;
        DeleteDirectory letsDeleteFolder = new DeleteDirectory ();

        letsDeleteFolder.directoryIsDeleted ();
        System.out.println ("--------------");

        //From here the task 2 begins.


        System.out.println ("Here is a task 2.");

        Cat someCat = new Cat ("Whiskers", 4, 5);

        System.out.println(someCat.toString());

        someCat.catsFolder();


        }
    }
