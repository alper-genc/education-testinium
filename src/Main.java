import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hesap = new Scanner(System.in);
        System.out.print("Lütfen Kullanici Adini Gir: ");
        String userName = hesap.nextLine();
        System.out.print("Lütfen Sifreni Gir: ");
        String password = hesap.nextLine();

        if ("admin".equals(userName) && "1234".equals(password)) {
            System.out.println("Giris Basarili");
        } else {
            System.out.println("Hatali Giris");
        }
    }
}