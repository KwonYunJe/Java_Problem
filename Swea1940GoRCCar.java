
import java.util.Scanner;

public class Swea1940GoRCCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        int[] answer = new int[t];

        for(int tc = 0 ; tc < t ; tc++){
            int sec = sc.nextInt();
            sc.nextLine();

            int speed = 0;

            int distance = 0;

            for(int i = 0 ; i < sec ; i++){
                String[] line = sc.nextLine().split(" ");

                switch (line[0]) {
                    case "0":
                        distance += speed;
                        break;
                    case "1":
                        speed += Integer.parseInt(line[1]);
                        distance += speed;
                        break;
                    case "2":
                        if(speed - Integer.parseInt(line[1]) >= 0){
                            speed -= Integer.parseInt(line[1]);
                            distance += speed;
                        }else{
                            speed = 0;
                        }
                        break;
                    default:
                        break;
                }
            }

            answer[tc] = distance;
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println("#" + (i+1) + " " + answer[i]);
        }
    }

}
