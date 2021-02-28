package bai11_stack_queue.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Nhập số thứ nhât: ");
        int a = scanner.nextInt();
        stack.push(a);
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        stack.push(b);
        System.out.print("Nhập số thứ ba: ");
        int c = scanner.nextInt();
        stack.push(c);
        List<Integer> array = new ArrayList<>();
        while (!stack.isEmpty()){
            array.add(stack.pop());
        }
        for (int i = 0; i < array.size() ; i++) {
            System.out.println(array.get(i));
        }
    }


}
