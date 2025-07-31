//https://www.acmicpc.net/problem/1181

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Backjoon1181WordSort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        //HashSet은 중복을 허용하지 않음 (중복 값 제거 목적)
        Set<String> wordsSet = new HashSet<>();

        for(int i = 0; i < n ; i++){
            wordsSet.add(br.readLine());
        }

        //정렬을 위해 List로 전환
        List<String> words = new ArrayList<>(wordsSet);

        Collections.sort(words, (a, b) -> {
            //words의 두 List길이를 비교
            if(a.length() != b.length()){
                //a의 비교대상인 b의 길이를 뺀 값을 리턴
                return a.length() - b.length();
                //양수일 경우 b,a...
                //음수일 경우 a,b...
                //0일 경우 위치 변화 없음.
            }else {
                //compareTo 메서드는 자동으로 사전 순서 기준으로 동작함.
                return a.compareTo(b);
            }
        });

        for(String word : words){
            bw.write(word);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
