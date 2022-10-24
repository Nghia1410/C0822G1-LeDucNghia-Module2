package ss12_java_collection_framework.exercise;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager extends Product {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> myArrayList = new ArrayList<>();
    Product product1 = new Product("Pubg", 12, 25000);
    Product product2 = new Product("Doreamon", 34, 130000);
    Product product3 = new Product("Fifa", 24, 3600000);

    {
        myArrayList.add(product1);
        myArrayList.add(product2);
        myArrayList.add(product3);

    }

    public void displayProduct() {
        System.out.println("Danh sách sản phẩm: ");
        System.out.println(myArrayList);
    }

    public void addProduct() {
        Product product = new Product();
        System.out.println("Nhập ID sản phẩm: ");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập tên sản phẩm: ");
        product.setProduct(scanner.nextLine());
        System.out.println("Nhập giá tiền sản phẩm: ");
        product.setPrice(Integer.parseInt(scanner.nextLine()));
        myArrayList.add(product);
        displayProduct();
    }

    public void editProduct() {
        System.out.println("Nhập ID sản phẩm muốn chỉnh sửa thông tin: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : myArrayList) {
            if (product.getId() == id) {
                System.out.println("Nhập game mới: ");
                product.setProduct(scanner.nextLine());
                System.out.println("Nhập giá game mới: ");
                product.setPrice(Integer.parseInt(scanner.nextLine()));
                product.setId(Integer.parseInt(scanner.nextLine()));
                displayProduct();
            }

        }
        System.out.println("Mã ID nhập vào chưa đúng.");

    }

    public void deleteProduct() {
        System.out.println("Nhập ID sản phẩm muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        myArrayList.removeIf(product -> product.getId() == id);
        displayProduct();
    }


    public void sortProduct() {
        Collections.sort(myArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        displayProduct();

    }

    public void searchProduct() {
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        int count = 0;
        for (Product key : myArrayList) {
            if (key.getProduct().indexOf(name) >= 0) {
                System.out.println(key);
            } else {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("tên nhập vào không hợp lệ");
        }


    }


}

