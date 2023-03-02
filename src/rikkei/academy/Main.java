package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Tạo 2 mảng số với kích thước cho trước
        int[] array1 = new int[5];
        int[] array2 = new int[3];

// Bước 2: Sử dụng vòng lặp nhập giá trị cho các phần tử trong mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các phần tử cho mảng 1:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Nhập các phần tử cho mảng 2:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

// Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int[] array3 = new int[array1.length + array2.length];

// Bước 4: Sử dụng vòng lặp để duyệt các phần tử trong mảng 1 và gán vào mảng 3
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

// Bước 5: Sử dụng vòng lặp để duyệt các phần tử trong mảng 2 và gán vào mảng 3
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

// In ra mảng 3 sau khi ghép
        System.out.println("Mảng sau khi ghép là:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
