package step2.leafYear_2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer input = Integer.valueOf(bufferedReader.readLine());
        System.out.println(((input % 4 == 0 && input % 100 != 0) || input % 400 == 0) ? 1 : 0);
    }

}
