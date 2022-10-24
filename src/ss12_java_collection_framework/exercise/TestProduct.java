package ss12_java_collection_framework.exercise;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choice;
        do {
            System.out.println("------CHOICE------\n" +
                    "1.Display products.\n " +
                    "2.Add product.\n" +
                    "3.Edit product.\n" +
                    "4.Delete product.\n" +
                    "5.Sort product.\n" +
                    "6.Search product.\n" +
                    "7.Exit.\n" +
                    "8.Return menu.");
            System.out.print("Choice of you : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.displayProduct();
                    break;
                case 2:
                    productManager.addProduct();
                    break;
                case 3:
                    productManager.editProduct();
                    break;
                case 4:
                    productManager.deleteProduct();
                    break;
                case 5:
                    productManager.sortProduct();
                    break;
                case 6:
                    productManager.searchProduct();
                case 7:
                    System.exit(1);
                    break;
                case 8:
                    break;
            }
        }
        while (true);
    }
}

