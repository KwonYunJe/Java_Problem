package VsCode_Java.Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//주석 처리 된 부분이 내가 복잡하게 로직을 처리한 부분.
//실제 작성된 코드처럼 작성할 수 있도록 해야 함.
public class Swea1979WordPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        List<Integer> answer = new ArrayList<>();

        for(int tc = 0 ; tc < t ; tc++){
            String[] stat = sc.nextLine().split(" ");
            int n = Integer.parseInt(stat[0]);
            int k = Integer.parseInt(stat[1]);

            int[][] puzzle = new int[n][n];

            int count = 0;

            for(int i = 0 ; i < n ; i++){
                String[] line = sc.nextLine().split(" ");
                for(int j = 0 ; j < n ; j++){
                    puzzle[i][j] = Integer.parseInt( line[j] );
                }
            }

            // 가로 탐색
            for (int i = 0; i < n; i++) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (puzzle[i][j] == 1) {
                        cnt++;
                    }
                    if (puzzle[i][j] == 0 || j == n - 1) {
                        if (cnt == k) count++;
                        cnt = 0;
                    }
                }
            }

            // 세로 탐색
            for (int j = 0; j < n; j++) {
                int cnt = 0;
                for (int i = 0; i < n; i++) {
                    if (puzzle[i][j] == 1) {
                        cnt++;
                    }
                    if (puzzle[i][j] == 0 || i == n - 1) {
                        if (cnt == k) count++;
                        cnt = 0;
                    }
                }
            }

            // for(int i = 0 ; i < n ; i++){
            //     for(int j = 0 ; j < n ; j++){
            //         if(puzzle[i][j] == 1 ){

            //             if(i < n - k && j < n - k){
            //                 for(int l = 0 ; l < k ; l++){
            //                     if(puzzle[i][j-1] == 1 || puzzle[i][j+l] == 0){
            //                         break;
            //                     }else if(l == k - 1){
            //                         if(j+l + 1 < n && puzzle[i][j+l + 1] == 1){
            //                             break;
            //                         }else{
            //                             count++;
            //                         }
            //                     }
            //                 }

            //                 for(int l = 0 ; l < k ; l++){
            //                     if(puzzle[i-1][j] == 1 || puzzle[i+l][j] == 0){
            //                         break;
            //                     }else if(l == k - 1){
            //                         if(i+l + 1 < n && puzzle[i+l + 1][j] == 1){
            //                             break;
            //                         }else{
            //                             count++;
            //                         }
            //                     }
            //                 }
            //             }else if(i < n - k && j >= n - k){
            //                 for(int l = 0 ; l < k ; l++){
            //                     if(puzzle[i-1][j] == 1 || puzzle[i+l][j] == 0){
            //                         break;
            //                     }else if(l == k - 1){
            //                         if(i+l + 1 < n && puzzle[i+l + 1][j] == 1){
            //                             break;
            //                         }else{
            //                             count++;
            //                         }
            //                     }
            //                 }
            //             }else if(j < n - k && i >= n - k){
            //                 for(int l = 0 ; l < k ; l++){
            //                     if(puzzle[i][j-1] == 1 || puzzle[i][j+l] == 0){
            //                         break;
            //                     }else if(l == k - 1){
            //                         if(j+l + 1 < n && puzzle[i][j+l + 1] == 1){
            //                             break;
            //                         }else{
            //                             count++;
            //                         }
            //                     }
            //                 }
            //             }

                        
            //         }
            //     }
            // }

            answer.add(count);
        }

        for(int i = 0 ; i < t ; i++){
            System.out.println("#" + (i+1) + " " + answer.get(i));
        }
    }
}
