package step2.score_9498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer input = Integer.valueOf(bufferedReader.readLine());
        System.out.println(input > 89 ? 'A' : input > 79 ? 'B' : input > 69 ? 'C' : input > 59 ? 'D' : 'F');
    }

}
