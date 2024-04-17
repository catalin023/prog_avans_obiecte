package lab8;

import java.io.*;

public class FileManagement {

    //metoda cu numar variabil de argumente. Vor fi transmise ca un Array
    //dupa tipul obiectului se pun 3 puncte
    public static void scriereObiectInFisier(String outputFile, Object... obj) {
        try(FileOutputStream fos = new FileOutputStream(outputFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(obj);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object[] citireObiectDinFisier(String fileName) {
        Object[] o;
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis)){
            o = (Object[]) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return o;
    }
}