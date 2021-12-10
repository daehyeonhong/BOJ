package step3.add_10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer times = Integer.valueOf(bufferedReader.readLine());

        for (int i = 0; i < times; i++) {
            String[] target = bufferedReader.readLine().split(" ");
            System.out.println(Integer.valueOf(target[0]) + Integer.valueOf(target[1]));
        }
    }

}
