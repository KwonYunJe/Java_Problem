
import java.util.Scanner;

public class Swea23791DesignatedPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        String[] answer = new String[t];

        for(int tc = 0 ; tc < t ; tc++){
            int length = sc.nextInt();
            sc.nextLine();
            String[] aLine = sc.nextLine().split(" ");
            String[] bLine = sc.nextLine().split(" ");
            int[][] preference = new int[2][length];

            char[] returnChar = new char[length];

            for(int i = 0 ; i < aLine.length; i++){
                preference[0][i] = Integer.parseInt(aLine[i]);
                preference[1][i] = Integer.parseInt(bLine[i]);
            }

            int aCount = 0;
            int bCount = 0;

            //선수 수 만큼 반복
            for(int i = 0 ; i < length ;i ++){

                //A가 지목
                if(i % 2 == 0){
                    while (true) {
                        //A가 지목할 선수가 지명된 상태가 아니라면
                        if(returnChar[preference[0][aCount] - 1] == 0){
                            //해당 번째 선수를 A팀으로 선택
                            returnChar[preference[0][aCount] - 1] = 'A';
                            break;
                        }else{
                            //A가 지목할 선수가 지명된 상태라면 다음 지명 선수를 불러옴
                            aCount++;
                        }
                    }
                //B가 지목
                }else{
                    while (true) {
                        if(returnChar[preference[1][bCount] - 1] == 0){
                            returnChar[preference[1][bCount] - 1] = 'B';
                            break;
                        }else{
                            bCount++;
                        }
                    }
                }
            }

            answer[tc] = new String(returnChar);
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }

        sc.close();
    }
}
