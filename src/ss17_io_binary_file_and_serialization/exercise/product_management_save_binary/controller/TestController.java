package ss17_io_binary_file_and_serialization.exercise.product_management_save_binary.controller;

import ss17_io_binary_file_and_serialization.exercise.product_management_save_binary.exception.IDException;
import ss17_io_binary_file_and_serialization.exercise.product_management_save_binary.model.Product;
import ss17_io_binary_file_and_serialization.exercise.product_management_save_binary.service.IProductService;
import ss17_io_binary_file_and_serialization.exercise.product_management_save_binary.service.impl.ProductService;
import ss17_io_binary_file_and_serialization.exercise.product_management_save_binary.utils.ReadWriteProductFileUtil;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestController {
    public static void menuController() throws IDException {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "điện thoại", "Iphone", 20000000));
        ReadWriteProductFileUtil.writeProductFile("src/ss17_io_binary_file_and_serialization/exercise/product_management_save_binary/data/product.csv", productList);
        Scanner scanner = new Scanner(System.in);
        IProductService iProductService = new ProductService();

        do {
            System.out.println("QUẢN LÍ SẢN PHẨM\n " +
                    "1. Thêm mới sản phẩm\n" +
                    " 2. Hiển thị danh sách sản phẩm\n" +
                    " 3. Tìm kiếm thông tin sản phẩm\n" +
                    " 4. Thoát.");

            int choose = 0;
            try {
                System.out.print("Nhập lựa chọn của bạn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }

            switch (choose) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.display();
                    break;
                case 3:
                    iProductService.find();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng nhập lại!");
            }
        } while (true);
    }
}
