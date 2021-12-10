package step1.rem_10430;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        System.out.println((x + y) % z);
        System.out.println(((x % z) + (y % z)) % z);
        System.out.println((x * y) % z);
        System.out.println(((x % z) * (y % z)) % z);
    }

}
