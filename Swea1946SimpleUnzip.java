package VsCode_Java.Java_Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Swea1946SimpleUnzip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        sc.nextLine();

        List<char[][]> answer = new ArrayList<>();

        for(int tc = 0 ; tc < t ; tc++){
            int num = sc.nextInt();
            sc.nextLine();
            String[][] alpha = new String[num][];

            for(int i = 0 ; i < num ; i++){
                String[] line = sc.nextLine().split(" ");
                alpha[i] = line;
            }

            int alphaNum = 0;

            for(int i = 0 ; i < num ; i++){
                alphaNum += Integer.parseInt(alpha[i][1]);
            }

            String[] allArr = new String[alphaNum];

            int count = 0;


            for(int i = 0 ; i < num; i++){
                for(int j = 0 ; j < Integer.parseInt(alpha[i][1]) ; j++){
                    allArr[count] = alpha[i][0];
                    count++;
                }
            }

            alphaNum = alphaNum / 10 + 1 ;

            char[][] arr = new char[alphaNum][10];

            count = 0;

            for(int i = 0 ; i < alphaNum; i++){
                for(int j = 0 ; j < 10 ; j++){
                    arr[i][j] = allArr[count].charAt(0);
                    count++;
                    if(count >= allArr.length){
                        break;
                    }
                }
            }

            answer.add(arr);
        }

        for(int i = 0 ; i < answer.size(); i ++ ){
            System.out.println("#" + (i + 1));
            for(int a = 0 ; a < answer.get(i).length ; a++){
                for(int b= 0 ; b < answer.get(i)[a].length; b++){
                    System.out.printf( answer.get(i)[a][b] + "");
                }
                System.out.println();
            }
        }
    }
}
