package VsCode_Java.Java_Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Swea22039DistributionOfFibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        String[] answer = new String[t];

        for(int tc = 0 ; tc < t ; tc++){
            int num = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            for(int i = 0 ; i < num ; i++){
                if(i == 0 || i == 1){
                    arr.add(1);
                }else{
                    arr.add(arr.get(arr.size() - 1)+arr.get(arr.size() - 2));
                }
            }

            if(arr.size() % 3 == 0){
                String str = "";
                for(int i = 0 ; i < arr.size() / 3 ; i++){
                    str += "BBA";
                }
                answer[tc] = str;
            }else if(arr.size() % 3 == 1){
                answer[tc] = "impossible";
            }else{
                String str = "BA";
                for(int i = 0 ; i < arr.size() / 3 ; i++){
                    str += "BBA";
                }
                answer[tc] = str;
            }

        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }

        sc.close();
    }
}
