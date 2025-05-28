
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
            //주어지는 개수만큼 배열의 행을 생성
            String[][] alpha = new String[num][];

            //상단에서 생성한 배열에 "알파벳", "개수" 형식으로 저장
            for(int i = 0 ; i < num ; i++){
                String[] line = sc.nextLine().split(" ");
                alpha[i] = line;
            }

            //알파벳 개수와 그에 따른 행 수를 저장하게 될 변수
            int alphaNum = 0;

            //알파벳의 개수를 모두 더함
            for(int i = 0 ; i < num ; i++){
                alphaNum += Integer.parseInt(alpha[i][1]);
            }

            //모든 알파벳을 개수만큼 생성하고 담을 배열 생성
            String[] allArr = new String[alphaNum];

            //상단의 배열의 포인터 역할을 할 변수
            int count = 0;

            //allArr 배열을 채움
            for(int i = 0 ; i < num; i++){
                for(int j = 0 ; j < Integer.parseInt(alpha[i][1]) ; j++){
                    allArr[count] = alpha[i][0];
                    count++;
                }
            }

            //정답 배열의 행 길이는 열 길이(10)를 나눈 값에 +1이 됨
            alphaNum = alphaNum / 10 + 1 ;

            //정답을 담을 배열
            char[][] arr = new char[alphaNum][10];

            //카운트 초기화
            count = 0;

            //정답을 담음
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
