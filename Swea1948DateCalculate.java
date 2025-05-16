package VsCode_Java.Java_Problem;

import java.util.Scanner;

public class Swea1948DateCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        int[] answer = new int[t];

        int[] monthDate = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for(int tc = 0 ; tc < t ; tc++){
            String[] dateStr = sc.nextLine().split(" ");
            int[] date = new int[dateStr.length];

            for(int i = 0 ; i < date.length ; i++){
                date[i] = Integer.parseInt(dateStr[i]);
            }

            int day = 0;

            if(date[0] == date[2]){
                day = date[3] - date[1];
            }else{
                for(int i = date[0]; i < date[2] - 1 ; i++){
                    day += monthDate[i];
                }

                day += (monthDate[date[0]-1] - date[1]) + date[3];
            }

            answer[tc] = day + 1;
        }

        for(int i = 0 ; i < answer.length ;i++){
            System.out.println("#" + (i+1) + " " + answer[i]);
        }
    }
}
