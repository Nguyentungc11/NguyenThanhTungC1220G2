package bai12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("1","vodka",12.0));
        productList.add(new Product("2","coca",13.0));
        productList.add(new Product("3","sting",10.0));
        productList.add(new Product("4","7up",9.0));
        while (check) {
            System.out.println("Menu chính: \n" +
                    "1.Thêm sản phẩm. \n" +
                    "2.Sửa thông tin sản phẩm. \n" +
                    "3.Xóa sản phẩm. \n" +
                    "4.Hiển thị. \n" +
                    "5.Sắp xếp \n" +
                    "6.Tìm kiếm. \n" +
                    "7.Exit.");
            int choice;
            System.out.print("Nhập lựa chon: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ProductManager.addProduct(productList);
                    break;
                case 2:
                    ProductManager.editProduct(productList);
                    break;
                case 3:
                    ProductManager.deleteProduct(productList);
                    break;
                case 4:
                    ProductManager.showProduct(productList);
                    break;
                case 5:
                    ProductManager.sort(productList);
                    break;
                case 6:
                    ProductManager.search(productList);
                    break;
                case 7:
                    check = false;
                    break;
                default:
                    System.out.println("Nhập lại:");
                    break;
            }
        }
    }
}
