package Com.GQHW01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("请输入三条边长");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a + b > c && a + c > b && b + c > a) {
            Tri tri = new Tri(a,b,c);
        }
       else
            System.out.println("非法三角形");
    }
}
