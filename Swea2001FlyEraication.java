package VsCode_Java.Java_Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Swea2001FlyEraication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> answer = new ArrayList<>();
        sc.nextLine();

        for(int tc = 0 ; tc < t ; tc++){

            String[] status = sc.nextLine().split(" ");
            int n = Integer.parseInt(status[0]);
            int m = Integer.parseInt(status[1]);

            int[][] pannel = new int[n][n];

            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ; j++){
                    pannel[i][j] = sc.nextInt();
                }
            }

            List<Integer> sumList = new ArrayList<>();

            for(int i = 0 ; i <= n - m ; i++){
                for(int j = 0 ; j <= n - m ; j++){

                    int sum = 0;
                    for(int k = i; k < i + m ; k++){
                        for(int l = j; l < j + m ; l++){
                            sum += pannel[k][l];
                        }
                    }

                    sumList.add(sum);
                }
            }

            answer.add(Collections.max(sumList));
        }

        for(int i = 0 ; i < t; i++){
            System.out.println("#" + (i + 1) + " " + answer.get(i));
        }
        
    }
}
