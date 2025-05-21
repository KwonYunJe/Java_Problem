package VsCode_Java.Java_Problem;

import java.util.Arrays;
import java.util.Scanner;

public class Swea23003AColoredRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        char[] answer = new char[t];

        String[] colorRing = new String[]{"red", "orange", "yellow", "green", "blue", "purple"};

        for(int tc = 0 ; tc < t ; tc++){
            String[] colors = sc.nextLine().split(" ");
            String[] beside = new String[]{colorRing[(Arrays.asList(colorRing).indexOf(colors[0]) + 5) % 6], colorRing[(Arrays.asList(colorRing).indexOf(colors[0]) + 1) % 6]};
            String oposite = colorRing[(Arrays.asList(colorRing).indexOf(colors[0]) + 3) % 6];
            boolean same = colors[0].equals(colors[1]);

            if(Arrays.asList(beside).contains(colors[1])){
                answer[tc] = 'A';
            }else if(colors[1].equals(oposite)){
                answer[tc] = 'C';
            }else if(same){
                answer[tc] = 'E';
            }else{
                answer[tc] = 'X';
            }
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }
    }
}
