
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Swea19003PalindromeProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        int[] answer = new int[t];

        for(int tc = 0 ; tc < t ;tc++){
            String[] num = sc.nextLine().split(" ");

            //모든 문자열이 담길 리스트
            List<String> strs = new ArrayList<>();
            //최종 문자열의 길이
            int allLength = 0 ;

            //문자열 리스트에 추가
            for(int i = 0 ; i < Integer.parseInt(num[0]) ; i++){
                String line = sc.nextLine();
                strs.add(line);
            }

            //리스트를 탐색할 포인터
            int index = 0;
            //문자열 끝까지 탐색
            while(index < strs.size()){
                //아래의 조건을 만족하면 ture가 저장될 boolean 변수
                boolean find = false;
                //탐색 중인 인덱스의 문자열과 그로부터 마지막 인덱스까지의 문자열을 한 개 씩 대조한다.
                for(int j = index + 1 ; j < strs.size() ; j ++){
                    //만약 두 개의 문자열이 회문을 이룬다면
                    if(TwoIsPalindrome(strs.get(index), strs.get(j))){
                        //두 개의 문자열 길이만큼 최종 길이에 추가
                        allLength += 2*Integer.parseInt(num[1]);    
                        //두 개의 문자열을 리스트에서 제거
                        strs.remove(j);
                        strs.remove(index);
                        //리스트의 처음부터 다시 탐색하기 위해 플래그 함수 true, 포인터 초기화
                        find = true;
                        index = 0;
                        //for문 정지
                        break;
                    }
                }
                //만약 조건을 만족하지 못했다면 다음 인덱스의 요소를 탐색
                if(!find) index++;
            }

            //위의 처리를 끝마치고 남아있는 문자열 중, 홀로 회문을 이루는 문자열을 찾는 반복문
            for(int i = 0 ; i < strs.size() ; i++){
                if( IsPalindrome(strs.get(i))){
                    //홀로 회문을 이루면 한 개 밖에 쓰지 못하므로 찾는 순간 반복문 정지
                    allLength += Integer.parseInt(num[1]);
                    break;
                }
            }

            answer[tc] = allLength;

        }

        //출력
        for(int i = 0 ; i < answer.length ; i ++){
            System.out.println("#" + (i + 1) + " " + answer[i]);
        }

        sc.close();
    }

    //하나의 문자열이 홀로 회문을 이루는지 판단 후 결과를 반환
    static boolean IsPalindrome(String str){
        for(int i = 0 ; i < str.length() / 2 ; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    //두 개의 문자열이 회문을 이루는지 판단 후 결과를 반환
    static boolean TwoIsPalindrome(String str1, String str2){
        for(int i = 0 ; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(str2.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
