import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int fizik,kimya,turkce,tarih,muzik;

        Scanner imp=new Scanner(System.in);
        System.out.print("Kimya Notunuzu giriniz: ");
        kimya=imp.nextInt();
        System.out.print("Fizik Notunuzu giriniz: ");
        fizik= imp.nextInt();
        System.out.print("Türkçe Notunuzu giriniz: ");
        turkce= imp.nextInt();
        System.out.print("Tarih Notunuzu giriniz: ");
        tarih= imp.nextInt();
        System.out.print("Müzik Notunuzu giriniz: ");
        muzik= imp.nextInt();

        double ort= (kimya + fizik + turkce + tarih + muzik) /5.0;
        System.out.println("Derslerinizin ortalaması: "+ ort);

        if (ort>=60)
        {
            System.out.println("Sınıfı Geçme Durumu: Geçti");
        }
        else
        {
            System.out.println("Sınıfı Geçme Durumu: Kaldı");
        }


    }
}