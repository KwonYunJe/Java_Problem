//https://www.acmicpc.net/problem/10814

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Backjoon10814SortByAge {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Member> memberList = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            String[] line = br.readLine().split(" ");
            Member member = new Member(Integer.parseInt(line[0]), line[1], i);
            memberList.add(member);
        }

        Collections.sort(memberList, Comparator
        .comparingInt((Member m) -> m.age)
        .thenComparingInt(m -> m.joinOrder));

        for(int i = 0 ; i < memberList.size(); i++){
            Member member = memberList.get(i);
            bw.write(String.valueOf(member.age) + " " + member.name + "\n");
        }
        bw.flush();
        bw.close();
    }

}

class Member {
    int age;
    String name;
    int joinOrder;

    public Member(int _age, String _name, int _joinOrder){
        age = _age;
        name = _name;
        joinOrder = _joinOrder;
    }
}