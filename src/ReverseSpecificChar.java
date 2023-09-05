import java.util.Scanner;

public class ReverseSpecificChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        char[] arr = str.toCharArray();

        int minIdx = 0;
        int maxIdx = arr.length-1;

        while(minIdx < maxIdx) {
            // minIdx가 특수문자일 시 idx 증가
            if(!Character.isLetter(arr[minIdx])) {
                minIdx++;

            // maxIdx가 특수문자일 시 idx 감소
            } else if (!Character.isLetter(arr[maxIdx])){
                maxIdx--;

            // minIdx, maxIdx 둘 다 문자일 시 각각 변경
            } else {
                char temp = arr[minIdx];
                arr[minIdx] = arr[maxIdx];
                arr[maxIdx] = temp;

                minIdx++;
                maxIdx--;
            }
        }

        System.out.println(new String(arr));
    }
}
