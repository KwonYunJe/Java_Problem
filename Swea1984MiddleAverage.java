
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Swea1984MiddleAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        List<Integer> answer = new ArrayList<>();

        for(int tc = 0 ; tc < t ; tc++){
            //한 줄 읽어 띄어쓰기 단위로 String 배열에 저장
            String[] inputLine = sc.nextLine().split(" ");
            //String 배열과 같은 길이의 int 배열 선언
            int[] intLine = new int[inputLine.length];

            //String 배열을 int 배열로 옮김
            for(int i = 0 ; i < inputLine. length; i++){
                intLine[i] = Integer.parseInt(inputLine[i]);
            }

            //배열 전체의 합
            float sum = Arrays.stream(intLine).sum();
            //배열 전체의 최고 값
            float max = Arrays.stream(intLine).max().getAsInt();
            //배열 전체의 최하 값
            float min = Arrays.stream(intLine).min().getAsInt();

            //전체 값에서 최고 값과 최하 값을 뺀 뒤 평균을 구함
            float value = (sum - max - min) / (intLine.length - 2);

            //소수 첫째자리에서 반올림이 필요하므로 round 함수 사용
            answer.add((int)Math.round(value));
        }

        for(int i = 0 ; i < t ; i++){
            System.out.println("#" + (i + 1) + " " + answer.get(i));
        }
        sc.close();
    }
}
