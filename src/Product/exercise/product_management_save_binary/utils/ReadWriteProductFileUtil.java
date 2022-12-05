package ss17_io_binary_file_and_serialization.exercise.product_management_save_binary.utils;

import ss17_io_binary_file_and_serialization.exercise.product_management_save_binary.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteProductFileUtil {
    public static List<Product> readProductFile(String path) {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;

    }

    public static void writeProductFile(String path, List<Product> productList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
