
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Swea1970EasyChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        sc.nextLine();

        List<int[]> answer = new ArrayList<>();

        for(int tc = 0 ; tc < t ; tc++){
            //거슬러줘야 할 돈을 입력 받음
            int money = sc.nextInt();
            //sc.nextLine();

            //거슬러 줄 돈을 각각 저장할 배열
            int[] change = new int[8];

            //거슬러 줄 돈의 개수를 구하고 그만큼 빼기를 반복함
            change[0] = money / 50000;
            money -= change[0] * 50000;
            change[1] = money / 10000;
            money -= change[1] * 10000;
            change[2] = money / 5000;
            money -= change[2] * 5000;
            change[3] = money / 1000;
            money -= change[3] * 1000;
            change[4] = money / 500;
            money -= change[4] * 500;
            change[5] = money / 100;
            money -= change[5] * 100;
            change[6] = money / 50;
            money -= change[6] * 50;
            change[7] = money / 10;

            //저장된 배열을 정답 리스트에 저장
            answer.add(change);
        }

        for(int i = 0 ; i < t; i++){
            System.out.println("#" + (i+1));
            for(int j = 0 ; j < answer.get(i).length ; j++){    
                System.out.printf(answer.get(i)[j] + " ");
            }
            System.out.println();
        }

    }
}
