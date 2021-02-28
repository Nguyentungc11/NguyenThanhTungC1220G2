package bai11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Input number: ");
        int num = scanner.nextInt();
        while (num != 0){
            int surplus = num % 2;
            stack.push(surplus);
            num/=2;
        }
        System.out.println("Số nhị phân:");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
