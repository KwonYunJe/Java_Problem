
import java.util.Arrays;
import java.util.Scanner;

public class Swea22795AverageOfSevenLoads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();
        sc.nextLine();

        int[] answer = new int[t];

        for(int tc = 0 ; tc < t ; tc++){
            String[] line = sc.nextLine().split(" ");
            int[] loads = new int[line.length];

            for(int i = 0 ; i < line.length ; i++){
                loads[i] = Integer.parseInt(line[i]);
            }

            //주어진 부하들의 키 중 가장 큰 값에 + 1(다른 부하들보다 커야하므로)을 함.
            int seventh = Arrays.stream(loads).max().getAsInt() + 1;

            //위에서 선언한 변수에 1을 더해가며 7로 나눴을 때 나머지가 0이 나올 때까지 반복.
            while(true){
                if((Arrays.stream(loads).sum() + seventh) % 7 != 0){
                    seventh++;
                }else{
                    break;
                }
            }

            answer[tc] = seventh;
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }
    }
}
