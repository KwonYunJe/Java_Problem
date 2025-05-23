package VsCode_Java.Java_Problem;

import java.util.Scanner;

public class Swea19185SexagenaryCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        String[] answer = new String[t];

        for(int tc = 0 ; tc < t ; tc++){
            String[] numLine = sc.nextLine().split(" ");
            int skyLen = Integer.parseInt(numLine[0]);
            int landLen = Integer.parseInt(numLine[1]);
            String[] skyArr = sc.nextLine().split(" ");
            String[] landArr = sc.nextLine().split(" ");

            int cycle = Integer.parseInt(sc.nextLine());

            String yearOf = "";

            for (int i = 0; i < cycle; i++) {
                int year = Integer.parseInt(sc.nextLine());

                String sky = skyArr[(year - 1) % skyLen];
                String land = landArr[(year - 1) % landLen];

                yearOf += sky + land + " ";
            }

            answer[tc] = yearOf;
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println("#" + (i+1) + " " + answer[i]);
        }

        sc.close();
    }
}
