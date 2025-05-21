package VsCode_Java.Java_Problem;

import java.util.Scanner;

public class Swea22979MoveString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        String[] answer = new String[t];

        for(int tc = 0 ; tc < t ; tc++){
            String str = sc.nextLine();
            int cycle = Integer.parseInt(sc.nextLine());

            String[] nums = sc.nextLine().split(" ");
            int[] cycleArr = new int[cycle];
            for (int i = 0; i < cycle; i++) {
                cycleArr[i] = Integer.parseInt(nums[i]);
            }

            for(int i = 0 ; i < cycleArr.length ; i++){
                int move = cycleArr[i] % str.length(); // 길이 넘어가면 의미 없음(중요!! : 무의미한 반복문으로 인해 시간복잡도가 상승함!!)

                if (move > 0) { // 왼쪽으로 move번 이동
                    str = str.substring(move) + str.substring(0, move);
                } else if (move < 0) { // 오른쪽으로 -move번 이동
                    move = -move;
                    str = str.substring(str.length() - move) + str.substring(0, str.length() - move);
                }
            }

            answer[tc] = str;
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }
    }
}
