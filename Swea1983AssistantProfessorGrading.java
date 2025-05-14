package VsCode_Java.Java_Problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Swea1983AssistantProfessorGrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());

        // 총 10개 등급으로 확장 (문제 상 D0까지지만 예외 방지용)
        String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "D0"};

        for (int tc = 1; tc <= testCase; tc++) {
            String[] stat = sc.nextLine().split(" ");
            int total = Integer.parseInt(stat[0]);
            int k = Integer.parseInt(stat[1]);

            Float[] scores = new Float[total];
            float kScore = 0f;

            for (int i = 0; i < total; i++) {
                String[] line = sc.nextLine().split(" ");
                float score = Float.parseFloat(line[0]) * 0.35f +
                              Float.parseFloat(line[1]) * 0.45f +
                              Float.parseFloat(line[2]) * 0.2f;
                scores[i] = score;
                if (i == k - 1) kScore = score;
            }

            Arrays.sort(scores, Collections.reverseOrder());

            int rank = 0;
            for (int i = 0; i < total; i++) {
                if (Math.abs(scores[i] - kScore) < 1e-6) {
                    rank = i;
                    break;
                }
            }

            int gradeCut = total / grade.length; // ← 핵심 수정 포인트
            int index = rank / gradeCut;
            if (index >= grade.length) index = grade.length - 1; // 안정성 확보

            System.out.println("#" + tc + " " + grade[index]);
        }
    }
}