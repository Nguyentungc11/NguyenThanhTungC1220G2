package bai12_java_collection_framework.bai_tap;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    public static void addProduct(List<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id sản phẩm: ");
        String id = scanner.next();
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.next();
        System.out.print("Nhập giá sản phẩm: ");
        Double price = scanner.nextDouble();
        Product product = new Product(id, name, price);
        list.add(product);
    }

    public static void showProduct(List<Product> list) {
        for (Product pro : list) {
            System.out.println(pro.toString());
        }
    }

    public static void deleteProduct(List<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh sách sản phẩm: ");
        showProduct(list);
        System.out.print("Nhập id của sản phẩm bạn muốn xóa: ");
        String id = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                list.remove(i);
            }
        }
    }

    public static void editProduct(List<Product> list) {
        Scanner scanner = new Scanner(System.in);
        showProduct(list);
        System.out.print("Nhập id sản phẩm bạn muốn sửa: ");
        String id = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                System.out.println("Nhập thông tin cần sửa: \n 1.Name \n 2.Giá.");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên mới: ");
                        String newName = scanner.next();
                        list.get(i).setName(newName);
                        break;
                    case 2:
                        System.out.println("Nhập giá mới: ");
                        double newPrice = scanner.nextDouble();
                        list.get(i).setPrice(newPrice);
                        break;
                }
            }

        }

    }

    public static void search(List<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm: ");
        String name = scanner.next();
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getName())) {
                System.out.println(list.get(i).toString());
            }

        }
    }
    public static void sort(List<Product> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Sắp xếp giá tăng dần. \n 2.Sắp xếp giá giảm dần.");
        System.out.println("Nhập cách sắp xếp: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                Collections.sort(list,new CompareByPriceIncrease());
                for (Product pro:list) {
                    System.out.println(pro.toString());
                }
                break;
            case 2:
                Collections.sort(list,new CompareByPriceReduce());
                for (Product product:list) {
                    System.out.println(product.toString());
                }
                break;
        }

    }
}
