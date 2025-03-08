import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int j = 0;
        int sum = 0;
        int count = 0;
        for (int i = 2; i <= num; i++) {
            for (j = 2; j <= i; j++) {
                if(i%j==0){
                    break;
                }
                }
            if(j==i){
                count++;
                System.out.println("第"+count+"个质数为"+i);
                sum = sum + i;
            }
        }
        System.out.println("所有质数的和:"+sum);
    }
}