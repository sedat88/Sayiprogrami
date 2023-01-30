import java.util.Scanner;
public class sayiprogrami {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            int a;
            int sayi = 0;
            int toplam = 0;

            System.out.print("Sayı Giriniz : ");
            a = inp.nextInt();

            for (int i = 1 ; i <= a; i++) {
                if (i % 3 == 0 && i % 4 == 0 ) {
                    sayi += i;
                    toplam++;
                    System.out.println("Bölünen sayı : " + i);

                }
            }
            double average = (double) sayi / toplam;
            System.out.println("Ortalama: " + average);


        }
}
