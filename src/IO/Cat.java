package IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Cat implements Serializable {

    //Here is a class for the task 2 of the Homework.
    //I've had to create a class Cat in the IO package, because it did not work as it should with a separate class Cat.
    String Name;
    int age;

    transient int weight;

    private static final long serialVersionUID = -12L;

    Cat (String n, int a, Integer o){
        //it is a serializable object without "weight" int.
        Name = n;
        age = a;
    }

    public Cat(String name, int age, int weight) {
        this.Name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Here is a Cat from task 2." +'\n' +
                "Cat's Name is: " + Name + "," + '\n' +
                "This Cat is " + age + " years old," + '\n' +
                "and a weight of this cat is " + weight + " kg." ;
    }

    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return Name == cat.Name;

    }
    // let's create a folder for this file
    public static void catsFolder () throws IOException {
        File someFile = new File("C:\\CatTask");
        boolean createDir = someFile.mkdir();
        System.out.println("Here we create a directory for the task's file.");
        if (createDir) {
            System.out.println("Directory for the task 2 has been created successfully");
        } else {
            System.out.println("Directory for the task 2 cannot be created");
        }

        String directoryPath = "C:\\CatTask";
        File file = new File (directoryPath);

        if (file.isDirectory()){
            System.out.println ("Directory of  the task 2 exists.");
        } else {
            System.out.println ("Directory of the task 2 does not exist.");
        }
    }

    public static void catCreateFile () throws IOException {
        //Here we create a file;
        Path catFile = Files.createFile (Paths.get ("C:\\CatTask\\testCatFile.dat"));
    }

}
