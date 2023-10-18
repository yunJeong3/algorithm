package section4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassPresident_1 {
    public Character solution(String vote, int arrLen) {
        // 투표 결과를 담기 위해 hashmap 생성
        HashMap<Character, Integer> map = new HashMap();

        for(int i=0; i<arrLen; i++) {
            char c = vote.charAt(i);

            // 중복되는 key값이 없으면 hashmap에 담기
            if(!map.containsKey(c)) map.put(c, 1);
            // 중복되는 key값이 있으면 value에 1추가
            else map.replace(c, map.get(c)+1);
        }

        Character maxKey = null;
        // for문을 돌며 key의 value값이 max에 담은 key의 value값보다 크면 갱신
        for(Character c : map.keySet()) {
            if(maxKey == null || map.get(c) > map.get(maxKey)) maxKey = c;
        }

        return maxKey;
    }
    public static void main(String[] args) {
        ClassPresident_1 T = new ClassPresident_1();
        Scanner scan = new Scanner(System.in);
        int arrLen = scan.nextInt();
        String vote = scan.next();

        System.out.println(T.solution(vote, arrLen));
    }
}
