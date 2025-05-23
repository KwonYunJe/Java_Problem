package VsCode_Java.Java_Problem;

import java.util.Scanner;

public class Swea20934BellMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        int[] answer = new int[t];

        for(int tc = 0 ; tc < t ; tc++){
            String[] line = sc.nextLine().split(" ");
            int bellIndex = line[0].indexOf("o");
            int count = Integer.parseInt(line[1]);

            int lastIndex = 0;

            if(count == 0){
                lastIndex = bellIndex;
            }else{
                switch (bellIndex) {
                    case 0:
                        if(count % 2 == 0){
                            lastIndex = 0;
                        }else{
                            lastIndex = 1;
                        }
                        break;
                    case 1:
                        if(count % 2 == 0){
                            lastIndex = 1;
                        }else{
                            lastIndex = 0;
                        }
                        break;
                    default:
                        if((count- 1) % 2 == 0){
                            lastIndex = 1;
                        }else{
                            lastIndex = 0;
                        }
                        break;
                }

            }

            answer[tc] = lastIndex;
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println("#" + (i + 1) + " " + answer[i]);
        }

        sc.close();
    }
}
