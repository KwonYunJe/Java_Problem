
import java.util.Scanner;

public class Swea20934BellMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        int[] answer = new int[t];

        for(int tc = 0 ; tc < t ; tc++){
            //컵위치 문자열, 방울이 울린 횟수를 분리
            String[] line = sc.nextLine().split(" ");
            //처음 방울 위치 가져오기
            int bellIndex = line[0].indexOf("o");
            //방울이 울린 횟수
            int count = Integer.parseInt(line[1]);

            //최종위치
            int lastIndex = 0;

            //한번도 움직이지 않았다면 처음위치 그대로
            if(count == 0){
                lastIndex = bellIndex;
            }else{
                //처음 방울 위치, 방울이 울린 횟수 % 2 의 값에 따른 위치 변동
                //방울이 중간->오른쪽 으로 갈 수도 있으나, 문제에서 같은 확률이라면 왼쪽을 출력하라고 했으므로
                //왼쪽으로 가는 경우만 취급
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
