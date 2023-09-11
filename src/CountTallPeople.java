import java.util.Scanner;

public class CountTallPeople {
    public static void main(String[] args) {
        // 맨 앞에서 볼 때 서있는 학생의 키가 보이는 만큼 세기.
        Scanner scan = new Scanner(System.in);
        int len = Integer.parseInt(scan.nextLine());
        String inpChildren = scan.nextLine();

        String[] childrenArr = inpChildren.split(" ");

        // 첫 번째 아이 키를 담고, 이후에 더 큰 아이 있으면 더 큰 아이로 담기
        int top = Integer.parseInt(childrenArr[0]);
        // 보이는 수만큼 count++
        int count = 1;

        for(int i=1; i<len; i++) {
            int height = Integer.parseInt(childrenArr[i]);
            if(top < height) {
                count++;
                top = height;
            }
        }
        System.out.println(count);
    }
}
