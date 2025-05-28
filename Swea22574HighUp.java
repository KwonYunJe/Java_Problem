
import java.util.Scanner;

public class Swea22574HighUp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();

        int[] answer = new int[t];

        for(int tc = 0 ; tc < t ; tc++){
            String[] line = sc.nextLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int p = Integer.parseInt(line[1]);
            int floor = 0;
            for(int i = 1 ; i < n+1 ; i++){
                if(floor + i != p){
                    floor += i;
                }else{
                    floor += i -1;
                }
            }
            answer[tc] = floor;
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }
        sc.close();
    }
}
