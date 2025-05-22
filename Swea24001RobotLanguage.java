package VsCode_Java.Java_Problem;

import java.util.Scanner;

public class Swea24001RobotLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        int[] answer = new int[t];

        for(int tc = 0 ; tc < t ; tc++){
            String line = sc.nextLine();
            int rCoordinate = 0;
            int lCoordinate = 0;
            int rMax = 0;
            int lMax = 0;

            for(int i = 0 ; i < line.length() ;i ++){
                switch (line.charAt(i)) {
                    case 'R':
                        rCoordinate++;
                        lCoordinate++;
                    break;
                    case 'L':
                        rCoordinate--;
                        lCoordinate--;
                    break;
                    default:
                        rCoordinate++;
                        lCoordinate--;
                    break;
                }
                rMax = Math.max(Math.abs(rCoordinate), rMax);
                lMax = Math.max(Math.abs(lCoordinate), lMax);
            }
            answer[tc] = Math.max(rMax, lMax);

        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }

        sc.close();
    }
}
