
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Swea1974SudokuVerification {
    public static void main(String[] args) {
        //스캐너
        Scanner sc = new Scanner(System.in);
        //테스트 케이스 횟수
        int t = sc.nextInt();
        //스캐너 버퍼 제거
        sc.nextLine();

        //테스트 개수만큼 정답배열 생성
        int[] answer = new int[t];

        //테스트 케이스만큼 반복
        for(int tc = 0 ; tc < t ; tc++){
            //스도쿠 칸(9*9)만큼 배열 생성
            int[][] puzzle = new int[9][9];

            //한줄에 숫자 9개씩 총 9줄이 주어지므로
            for(int i = 0 ; i < 9 ; i++){
                //한 줄의 숫자를 String 배열로 저장하고
                String[] line = sc.nextLine().split(" ");
                //String 배열에서 저장된 순서대로 스도쿠 칸 배열에 저장
                for(int j = 0 ; j < 9 ; j++){
                    puzzle[i][j] = Integer.parseInt(line[j]);
                }
            }

            //세로, 가로, 3*3배열을 검증하고 나온 결과를 저장할 boolean 함수 선언
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

                //리스트와 set을 비교해서 길이가 다르면 기존 col값을 false로 변경하고 정지
                if(list.size() != set.size()){
                    col = false;
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
                    row = false;
                    break;
                }
            }

            //3*3 판별
            //탐색을 시작할 지점을 옮기기 위한 2중 for문 : 3씩 증가 (0,0),(3,0),(6,0),(0,3)(3,3)...
            for(int i = 0 ; i < 9 ; i += 3){
                for(int j = 0 ; j < 9 ; j += 3){

                    //해당 영역 안에 있는 숫자 9개를 담을 리스트 생성
                    List<Integer> list = new ArrayList<>();
                    //반복문으로 3*3영역을 저장
                    for(int ii = 0 ; ii < 3 ; ii++){
                        for(int jj = 0 ; jj < 3 ; jj++){
                            list.add(puzzle[i+ii][j+jj]);
                        }
                    }
                    //선언한 리스트를 set으로 중복값을 제거
                    Set<Integer> set = new HashSet<>(list);
                    //기존 리스트와 set으로 중복값을 제거했을 때 값이 다른 경우
                    if(list.size() != set.size()){
                        //검증 결과를 거짓으로 지정
                        square = false;
                        //반복문 종료
                        break;
                    }
                }
            }

            //모든 검증이 참일 때
            if(col && row && square){
                //1을(조건 충족)반환
                answer[tc] = 1;
            //그렇지 못할 경우
            }else{
                //0을(조건 미충족)반환
                answer[tc] = 0;
            }
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println("#" + (i+1) + " " + answer[i]);
        }
        
    }
}
