public class Main {

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Slide74 {
    public static void main(String[] args) {
        int n;
        int a[];
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu trong mang: ");
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu thu " + i + ": ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                tong += a[i];
            }
        }
        System.out.println("Tong cac so chan la: " + tong);
    }

}}