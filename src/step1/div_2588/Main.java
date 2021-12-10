package step1.div_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(bufferedReader.readLine());
        int y = Integer.parseInt(bufferedReader.readLine());

        int hundred = 100;
        int ten = 10;
        int threeDigitNumber = y / hundred * hundred;
        int twoDigitNumber = (y - threeDigitNumber) / ten * ten;
        int oneDigitNumber = y - threeDigitNumber - twoDigitNumber;
        System.out.println(x * oneDigitNumber);
        System.out.println(x * twoDigitNumber / ten);
        System.out.println(x * threeDigitNumber / hundred);
        System.out.println(x * y);
    }

}
