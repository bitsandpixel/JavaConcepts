package corejava;

import java.io.*;
import java.sql.Savepoint;

/**
 * Simple Serialization in java
 * @author Vishnu Kandanelly
 */
public class serializing {
    public static void main(String[] args) throws Exception {
        Save obj = new Save();
        obj.i = 1;

        File file = new File("obj.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(objectOutputStream);//TODO: resolve the exception

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Save objNew = (Save) objectInputStream.readObject();

        System.out.println(objNew.i);
    }
}

class Save implements Serializable {
    int i;
}
