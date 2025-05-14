package VsCode_Java.Java_Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheMillionaireProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());  // int로 바꿔도 충분

        List<Long> answer = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int day = Integer.parseInt(sc.nextLine());  // day도 int로
            long[] price = new long[day];

            String[] inputs = sc.nextLine().split(" ");  // 한 줄에 입력받기

            for (int j = 0; j < day; j++) {
                price[j] = Long.parseLong(inputs[j]);
            }

            long max = 0;
            long income = 0;

            for (int j = day - 1; j >= 0; j--) {
                if (price[j] >= max) {
                    max = price[j];
                } else {
                    income += max - price[j];
                }
            }

            answer.add(income);
        }

        for (int i = 0; i < answer.size(); i++) {
            System.out.println("#" + (i + 1) + " " + answer.get(i));
        }

        sc.close(); // 리소스 정리
    }
}
