
import java.util.Scanner;

public class Swea19185SexagenaryCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        String[] answer = new String[t];

        for(int tc = 0 ; tc < t ; tc++){
            //각 문자열 배열의 길이를 저장
            String[] numLine = sc.nextLine().split(" ");
            int skyLen = Integer.parseInt(numLine[0]);
            int landLen = Integer.parseInt(numLine[1]);

            // 각 십간, 십이지 배열을 저장
            String[] skyArr = sc.nextLine().split(" ");
            String[] landArr = sc.nextLine().split(" ");

            //알고 싶은 년도의 개수
            int cycle = Integer.parseInt(sc.nextLine());

            //알고자 하는 년도의 연호
            String yearOf = "";

            for (int i = 0; i < cycle; i++) {
                int year = Integer.parseInt(sc.nextLine());

                //년 수에서 각 십간, 십이지의 길이를 나눈 나머지를 각각 구한다.
                //그리고 십간, 십이지의 배열에서 해당 숫자의 인덱스를 각각 가져온다.
                String sky = skyArr[(year - 1) % skyLen];
                String land = landArr[(year - 1) % landLen];

                //두 문자열을 붙여 연호를 완성한다.
                yearOf += sky + land + " ";
            }

            answer[tc] = yearOf;
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println("#" + (i+1) + " " + answer[i]);
        }

        sc.close();
    }
}
