
import java.util.Scanner;

public class Swea2007PatternLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine(); // 꼭 필요! 엔터 제거

        //테스트케이스만큼 반복
        for (int tc = 1; tc <= t; tc++) {
            //입력줄 받기
            String str = sc.nextLine();

            //패턴의 길이
            int patternLength = 0;

            //패턴의 최대길이(10)만큼 반복
            for (int i = 1; i <= 10; i++) {
                //접두사 선언 후 0번째부터 i번째까지 substring으로 잘라 넣음
                String prefix = str.substring(0, i);
                //다음 비교 단어를 담을 변수 선언후 i번째부터 i*2 번째까지 잘라 넣음
                String next = str.substring(i, i * 2);


                //이후 두 변수를 비교하여 동일하다면
                if (prefix.equals(next)) {
                    //패턴의 길이를 저장하고 반복문 정지
                    patternLength = i;
                    break;
                }
            }

            System.out.println("#" + tc + " " + patternLength);
        }
        sc.close();
    }
}
