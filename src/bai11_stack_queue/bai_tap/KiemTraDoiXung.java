package bai11_stack_queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KiemTraDoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new LinkedList();
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String string = scanner.nextLine();
        for (int i = string.length() - 1; i >= 0; i--) {
            queue.add(string.charAt(i));
        }
            String string1 = "";
            while (!queue.isEmpty()) {
                string1 += queue.remove();
            }
            if (string1.equals(string)){
                System.out.println("Chuỗi đối xứng.");
            }else {
                System.out.println("chuỗi không đối xứng.");
            }
        }
    }
