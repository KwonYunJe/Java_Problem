package VsCode_Java.Java_Problem;

import java.util.Scanner;

public class Swea20551IncreasingCandySequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        int[] answer = new int[t];

        for(int tc = 0 ; tc < t ; tc++){
            String[] line = sc.nextLine().split(" ");
            int[] candyBox = new int[]{Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2])};


            //C박스가 2이하라면 애초에 조건이 성립할 수가 없음
            if(candyBox[2] <=2){
                answer[tc] = -1;
            }else{
                //먹어야할 캔디 개수
                int eatCandy = 0;

                //B박스가 C박스 보다 많다면 C박스보다 1개 적게 만들고 그 차이만큼 먹어야할 캔디 개수에 더함.
                if(candyBox[1] >= candyBox[2]){
                    eatCandy += candyBox[1] - (candyBox[2]-1);
                    candyBox[1] = candyBox[2]-1;
                }
                //A스가 B박스 보다 많다면 B박스보다 1개 적게 만들고 그 차이만큼 먹어야할 캔디 개수에 더함.
                if(candyBox[0] >= candyBox[1]){
                    eatCandy += candyBox[0] - (candyBox[1]-1);
                    candyBox[0] = candyBox[1]-1;
                }

                //최종적으로 박스에 담겨있는 캔디의 개수가 모두 0이 아니어야 함.
                if(candyBox[0] < 1 || candyBox[1] < 1 || candyBox[2] < 1){
                    answer[tc] = -1;
                }else{
                    answer[tc] = eatCandy;
                }
            }
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println("#" + (i+1) + " " + answer[i]);
        }

        sc.close();
    }
}
