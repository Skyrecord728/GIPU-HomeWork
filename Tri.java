package Com.GQHW01;

public class Tri {
     Tri(int a, int b, int c) {
        int p = (a + b + c) / 2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("面积为："+S);
        System.out.println("周长为："+2*p);
    }
}
