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
            //6으로 나눈 나머지를 구하는 이유 : index를 벗어나지 않고 초과한 만큼 index 내에서 찾기 위함.
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

        sc.close();

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }
    }
}
