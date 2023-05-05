import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String password, yeniPassword, userName;
        int secim;

        System.out.print("Kullanici adinizi giriniz:");
        userName = inp.nextLine();

        System.out.print("Sifrenizi giriniz:");
        password = inp.nextLine();

        if (password.equals("patika1234") && userName.equals("patika")) {
            System.out.print("Giris basarili.");
        } else {
            System.out.println("Giris basarisiz.");
            System.out.print("Sifrenizi sıfırlamak istiyor musunuz? evet ise 1'e, hayır ise 2'ye bas");
            secim = inp.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Yeni sifrenizi giriniz:");
                    yeniPassword = inp.next();
                    if (yeniPassword.equals("patika1234")) {
                        System.out.print("Yeni sifreniz eskisiyle ayni olamaz.");
                    } else {
                        System.out.print("Sifreniz degistirilmistir.");
                    }
                    break;
                case 2:
                    System.out.print("İslem sonlandi.");
                    break;
                default:
                    System.out.print("Hatali giris!");
            }
        }
    }
}