package bai_14_thuattoan_sapxep.thuchanh;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Input " + list.length + "values.");
        for (int i = 0; i < list.length ; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] +" ");
        }
        System.out.println("Begin sort: ");
        bubbleSort(list);
    }

    public static void bubbleSort(int[] list){
        boolean pass = true;
        for (int i = 1; i < list.length ; i++) {
            pass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("Swap " + list[j] + " and " + list[j + 1]);
                    int temp = 0;
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                     pass = true;
                }
            }
            if (!pass){
                System.out.println("List was sorted");
                break;
        }
        }
        System.out.println("List after sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);

        }
    }
}
