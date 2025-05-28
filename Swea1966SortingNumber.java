
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Swea1966SortingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        List<int[]> answer = new ArrayList<>();

        for(int tc = 0; tc < t; tc++){
            //한 줄에 입력받을 숫자 개수 입력 받음
            int numLength = sc.nextInt();
            //버퍼 비우기
            sc.nextLine();
            //입력되는 숫자를 띄어쓰기 단위로 끊어서 String 배열에 저장
            String[] numLine = sc.nextLine().split(" ");
            //숫자 개수만큼 int 배열 생성
            int[] num = new int[numLength];

            //String 배열을 int 배열로 형변환 후 저장
            for(int i = 0 ; i < numLength ; i++){
                num[i] = Integer.parseInt(numLine[i]);
            }

            //int 배열을 오름차순으로 정렬
            Arrays.sort(num);

            //오름차순 정렬된 배열을 정답 리스트에 저장
            answer.add(num);
        }

        for(int i = 0 ; i < answer.size(); i++){
            System.out.printf("#" + (i + 1) + " ");
            for(int j = 0 ; j < answer.get(i).length; j++){
                System.out.printf(answer.get(i)[j] + " ");
            }
            System.out.println();
        }
    }
}
