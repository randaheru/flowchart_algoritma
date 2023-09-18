import java.util.Scanner;

public class persegipanjang {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int panjang;
        int lebar;
        int keliling;
        int luas;

        panjang = input.nextInt();
        lebar = input.nextInt();

        keliling = 2 * (panjang + lebar);
        luas = panjang * lebar;

        System.out.println(keliling);
        System.out.println(luas);
    }
}