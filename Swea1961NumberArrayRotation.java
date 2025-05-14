package VsCode_Java.Java_Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Swea1961NumberArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        List<String[][]> answer = new ArrayList<>();

        for(int tc = 0; tc < t ; tc++){
            int length = sc.nextInt();
            sc.nextLine();

            int[][] arr = new int[length][length];

            for(int i = 0 ; i < length ; i++){
                String[] line = sc.nextLine().split(" ");
                for(int j = 0 ; j < length ; j++){
                    arr[i][j] = Integer.parseInt(line[j]);
                }
            }

            String[][] rotationArr = new String[length][3];

            //각 반복문은 회전되었을 경우 배열의 (0,0) ~ (length, length) 까지의 왼쪽~오른쪽, 위~아래 방향으로 출력되도록 함.
            //90도 회전
            for(int i = 0 ; i < length ; i++){
                String element = "";
                for(int j = length - 1 ; j >= 0 ; j--){
                    element += "" + arr[j][i];
                }
                rotationArr[i][0] = element;
            }

            //180도 회전
            for(int i = length - 1 ; i >= 0 ; i--){
                String element = "";
                for(int j = length - 1 ; j >= 0 ; j--){
                    element += "" + arr[i][j];
                }
                rotationArr[length - i - 1][1] = element;
            }

            //270도 회전
            for(int i = length - 1 ; i >= 0 ; i--){
                String element = "";
                for(int j = 0; j < length ; j++){
                    element += "" + arr[j][i];
                }
                rotationArr[length - i - 1][2] = element;
            }

            answer.add(rotationArr);
        }

        for(int i = 0; i < answer.size(); i++){
            System.out.println("#" + (i+1));
            for(int a = 0 ; a < answer.get(i).length ; a++){
                for(int b = 0 ; b < 3 ; b++){
                    System.out.printf("" + answer.get(i)[a][b] + " ");
                }
                System.out.println();
            }
        }
    }
}
