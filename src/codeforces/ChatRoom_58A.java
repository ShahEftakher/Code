package codeforces;

import java.util.Scanner;

public class ChatRoom_58A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = "hello";
        if (s1.length() < 5) {
            System.out.println("NO");
            return;
        }
        int i = 0, j = 0;
        while (j < s1.length() ) {
            if (s1.charAt(j) == s2.charAt(i)) {
                i += 1;
            }
            j += 1;
            if (i == 5) break;
        }

        if (i == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
