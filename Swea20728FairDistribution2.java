package VsCode_Java.Java_Problem;

import java.util.Arrays;
import java.util.Scanner;

public class Swea20728FairDistribution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        int[] answer = new int[t];

        for(int tc = 0 ; tc < t ; tc++){
            String[] line1 = sc.nextLine().split(" ");
            String[] line2 = sc.nextLine().split(" ");
            
            //배열 생성
            int[] pocket = new int[Integer.parseInt(line1[0])];

            for(int i = 0 ; i < pocket.length ;i++){
                pocket[i] = Integer.parseInt(line2[i]);
            }

            //배열 오름차순 정렬
            Arrays.sort(pocket);

            //최소 차이를 저장할 변수
            int min = 0;

            //(i + 주머니개수) - i 가 가장 작은 수를 저장할 수 있도록 반복문을 구성(슬라이딩 윈도우)
            for(int i = 0 ; i <= pocket.length - Integer.parseInt(line1[1]); i++){
                int diff = pocket[i + Integer.parseInt(line1[1]) - 1] - pocket[i];
                if(min == 0 || diff < min){
                    min = diff;
                }
            }

            answer[tc] = min;
        }

        for(int i = 0 ; i< answer.length ; i++){
            System.out.println("#" + (i + 1) + " " + answer[i]);
        }

        sc.close();
    }
}
