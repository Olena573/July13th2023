
package IO;
import java.io.*;
import java.io.IOException;
public class IO {
    //this is a second class for the task 2. It allows us to serialize objects from class Cat.

    public static void main (String [] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\CatTask\\testCatFile.dat"))) {
            Cat someCat = new Cat ("Whiskers", 4, 5);
            oos.writeObject(someCat);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\CatTask\\testCatFile.dat"))) {
            Cat cat = (Cat)ois.readObject();
            System.out.println(cat.toString());
        } catch (Exception ex) {
            System.out.println (ex.getMessage());
        }

        }
    }

