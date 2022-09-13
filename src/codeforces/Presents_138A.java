package codeforces;

import java.util.Scanner;

/**
 *
 */
class Presents_138A_alt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            int value = input.nextInt();
            arr[value] = i;
        }
        input.close();
        for (int i = 1; i < n + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Presents_138A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        for (int i = 1; i < n+1; i++) {
            int value = arr[i];
            System.out.print(arr[n - value] + " ");
        }
    }
}