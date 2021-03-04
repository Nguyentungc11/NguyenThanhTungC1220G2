package bai_13_thuattoan_timkiem.thuc_hanh.caidat_timkiem_nhiphan;

import java.util.Scanner;

public class BinarySearch {
    static int[] list = {1,2,3,5,7,9,23,34,45};
    public static int binarySearch(int[] list,int key){
        int low = 0;
        int high = list.length -1;
        while (high>=low){
            int mid = (low + high)/2;
            if(key > list[mid]){
                low = mid + 1;
            }else {
                if (key == list[mid]){
                    return mid;
                }else {
                    high = mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input element you need to search: ");
        int key = scanner.nextInt();
        System.out.println(binarySearch(list,key));
    }
}
