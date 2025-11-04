import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int angka = input.nextInt();

        if (angka < 0) {
            System.out.println("Bilangan harus positif.");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= angka; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + angka + " adalah " + faktorial);
        }

        input.close();
    }
}
