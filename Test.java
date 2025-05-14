package VsCode_Java.Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("사이클 입력");
        int cycle = Integer.parseInt(bf.readLine());

        List<String> answer = new ArrayList<>();

        for(int i = 0 ; i < cycle ; i++){
            //System.out.println("선수 명단 길이 입력");
            int lineUp = Integer.parseInt(bf.readLine());
            
            int[][] preference = new int[2][lineUp];

            //System.out.println("a구단 선호도 입력");
            String aInput = bf.readLine();
            //System.out.println("b구단 선호도 입력");
            String bInput = bf.readLine();

            char[] answerLine = new char[lineUp];

            int count = 0;

            for(int j = 0 ; j < aInput.length() ; j++){
                if(aInput.charAt(j) != ' '){
                    preference[0][count] = Character.getNumericValue(aInput.charAt(j));
                    count++; 
                }
            }

            count = 0;

            for(int j = 0 ; j < bInput.length() ; j++){
                if(bInput.charAt(j) != ' '){
                    preference[1][count] = Character.getNumericValue(bInput.charAt(j));
                    count++; 
                }
            }


            // for(int j = 0 ; j < preference[0].length ;j++){
            //     System.out.printf(preference[0][j] + ",");
            // }
            // for(int j = 0 ; j < preference[1].length ;j++){
            //     System.out.printf(preference[1][j] + ",");
            // }



            for(int j = 1 ; j <= lineUp ; j++){
                if(j % 2 != 0){
                    int num = Arrays.stream(preference[0]).min().getAsInt();
                    //System.out.println("A num : " + num);
                    int index = findIndex(preference[0], num);
                    //System.out.println("A index : " + index);
                    answerLine[index] = 'A';
                    preference[0][index] = 99;
                    preference[1][index] = 99;
                }else{
                    int num = Arrays.stream(preference[1]).min().getAsInt();
                    //System.out.println("B num : " + num);
                    int index = findIndex(preference[1], num);
                    //System.out.println("B index : " + index);

                    answerLine[index] = 'B';
                    preference[0][index] = 99;
                    preference[1][index] = 99;
                }     
            }

            String faList = Arrays.toString(answerLine);
            faList = faList.replaceAll(", ", "");
            //System.out.println(faList);
            answer.add(new String(faList));
        }

        for (String indexString : answer) {
            for(int i = 0 ; i < indexString.length() ; i++){
                if(indexString.charAt(i) != ']' && indexString.charAt(i) != '['){
                    System.out.printf(indexString.charAt(i) + "");
                }
            }
            System.out.println();
        }
    }

    private static int findIndex(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // 못 찾으면 -1
    }
}
