
import java.util.Scanner;

public class Swea20955XYString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        String[] answer = new String[t];

        for(int tc = 0 ; tc < t ; tc++){
            String str = sc.nextLine();
            String targetStr = sc.nextLine();

            //주어진 문자열과 목표 문자열의 길이가 같을때까지 반복 (아래 과정을 거치며 길이가 1씩 줄어듦)
            while(str.length() != targetStr.length()){
                //목표 문자열의 가장 끝 문자가 X일 경우
                if(targetStr.charAt(targetStr.length() - 1) == 'X'){
                    //문자열의 제일 끝을 지우는 메서드를 실행후 목표 문자열로 저장
                    targetStr = Operation1(targetStr);
                //목표 문자열의 가장 끝 문자가 Y일 경우
                }else{
                    //문자열을 뒤집고 제일 끝을 지우는 메서드를 실행후 목표 문자열로 저장
                    targetStr = Operation2(targetStr);
                }
            }

            //최종적으로 남은 목표 문자열과 주어진 문자열이 동일하면 Yes
            //동일하지 않으면 No를 출력
            if(str.equals(targetStr)){
                answer[tc] = "Yes";
            }else{
                answer[tc] = "No";
            }
        }

        for(int i = 0 ; i < answer.length ; i++){
            System.out.println("#" + (i+ 1) + " " + answer[i]);
        }

        sc.close();
    }

    static String Operation1(String str){
        //StringBuilder 생성
        StringBuilder sb = new StringBuilder(str);
        //제일 끝 문자 삭제
        str = sb.deleteCharAt(str.length() - 1).toString();
        //반환
        return str;
    }

    static String Operation2(String str){
        //StringBuilder 생성
        StringBuilder sb = new StringBuilder(str);
        //제일 끝 문자 삭제
        sb.deleteCharAt(str.length() - 1).toString();
        //문자열 뒤집기
        str = sb.reverse().toString();
        //반환
        return str;
    }
}
