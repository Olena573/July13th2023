import java.io.*;

public class FileCopyingWords {
    //Here is a class for task 1. In which we read words from 1 file and write into another.

    public static void wordsFromFirstFile() throws Exception {

        FileReader someFileReader = new FileReader("C:\\Educational\\testFile1.txt");
        FileWriter someFileWriter = new FileWriter("C:\\Educational\\testFile2.txt");
        int i;
        while ((i = someFileReader.read()) != -1) {
            someFileWriter.write(i);
        }
        someFileWriter.close();
        someFileReader.close();
        System.out.println("Words were copied from first file into another file.");

    }

}