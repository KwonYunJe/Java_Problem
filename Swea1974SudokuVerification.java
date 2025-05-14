package VsCode_Java.Java_Problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Swea1974SudokuVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        int[] answer = new int[t];

        for(int tc = 0 ; tc < t ; tc++){
            int[][] puzzle = new int[9][9];

            for(int i = 0 ; i < 9 ; i++){
                String[] line = sc.nextLine().split(" ");
                for(int j = 0 ; j < 9 ; j++){
                    puzzle[i][j] = Integer.parseInt(line[j]);
                }
            }

            boolean row = true;
            boolean col = true;
            boolean square = true;

            //가로행 판별
            for(int i = 0 ; i < 9 ; i++){

                //리스트 생성
                List<Integer> list = new ArrayList<>();
                //리스트에 가로행을 하나씩 추가
                for(int j = 0 ; j < 9 ; j++){
                    list.add(puzzle[i][j]);
                }
                //리스트를 Set으로 중복값 제거
                Set<Integer> set = new HashSet<>(list);

                //리스트와 set을 비교해서 길이가 다르면 기존 row값을 false로 변경하고 정지
                if(list.size() != set.size()){
                    row = false;
                    break;
                }
            }

            //세로열 판별
            for(int i = 0 ; i < 9 ; i++){

                //리스트 생성
                List<Integer> list = new ArrayList<>();
                //리스트에 세로열을 하나씩 추가
                for(int j = 0 ; j < 9 ; j++){
                    list.add(puzzle[j][i]);
                }
                //리스트를 Set으로 중복값 제거
                Set<Integer> set = new HashSet<>(list);

                //리스트와 set을 비교해서 길이가 다르면 기존 row값을 false로 변경하고 정지
                if(list.size() != set.size()){
                    col = false;
                    break;
                }
            }

            //3*3 판별
            for(int i = 0 ; i < 9 ; i += 3){
                for(int j = 0 ; j < 9 ; j += 3){
                    List<Integer> list = new ArrayList<>();
                    for(int ii = 0 ; ii < 3 ; ii++){
                        for(int jj = 0 ; jj < 3 ; jj++){
                            list.add(puzzle[i+ii][j+jj]);
                        }
                    }
                    Set<Integer> set = new HashSet<>(list);
                    if(list.size() != set.size()){
                        square = false;
                        break;
                    }
                }
            }

            if(col && row && square){
                answer[tc] = 1;
            }else{
                answer[tc] = 0;
            }
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println("#" + (i+1) + " " + answer[i]);
        }
        
    }
}
