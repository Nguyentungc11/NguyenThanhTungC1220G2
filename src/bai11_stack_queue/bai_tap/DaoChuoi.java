package bai11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DaoChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string = scanner.nextLine();
        Stack<Character >  stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        for (int i = stack.size()-1; i >=0 ; i--) {
            System.out.print(stack.get(i));
        }
    }
}
