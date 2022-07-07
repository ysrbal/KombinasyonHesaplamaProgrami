import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, r, total1 = 1, total2 = 1, total3 = 1, result;
        System.out.print("n sayisini giriniz : ");
        n = inp.nextInt();
        System.out.print("r sayisini giriniz : ");
        r = inp.nextInt();

        for (int i1 = 1; i1 <= n; i1++) {
            total1 *= i1;
        }

        for (int i2 = 1; i2 <= r; i2++) {
            total2 *= i2;
        }
        int fark = (n - r);
        for (int i3 = 1; i3 <= fark; i3++) {
            total3 *= fark;
        }

        result = (total1 / (total2*total3));
        System.out.println("C("+n+","+r+") :"+result);
    }


}

