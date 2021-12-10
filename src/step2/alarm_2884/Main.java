package step2.alarm_2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bufferedReader.readLine().split(" ");
        int hour = Integer.parseInt(input[0]);
        int minute = Integer.parseInt(input[1]);

        if (minute >= 45) {
            minute -= 45;
        } else {
            hour = hour > 0 ? --hour : 23;
            minute += 60 - 45;
        }
        System.out.println(String.format("%s %s", hour, minute));
    }

}
