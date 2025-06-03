
import java.util.Scanner;

public class Swea21425PlusEqual {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            sc.nextLine();

            int[] answer = new int[t];

            for(int tc = 0 ; tc < t ; tc++){
                String[] line = sc.nextLine().split(" ");

                int x = Integer.parseInt( line[0] );
                int y = Integer.parseInt( line[1] );
                int min = Integer.parseInt( line[2] );

                int count = 0 ;

                while (x <= min && y <= min) {
                    if(x >= y) {
                        y += x;
                    }else{
                        x += y;
                    }
                    count++;
                }

                answer[tc] = count;
            }
            
            for(int i = 0 ; i < answer.length ; i++){
                System.out.println(answer[i]);
            }
            sc.close();
        }
    }
