import java.util.Scanner;


public class Atm {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        String  kullaniciadi="orhan", sifre="acikgoz";
        int secim, bakiye=6000,secim2, secim3,hak=3;



        while (hak>0){
        System.out.println("Kullanici adinizi giriniz: ");
        kullaniciadi=inp.nextLine();
        System.out.println("Sifrenizi giriniz: ");
        sifre=inp.nextLine();



          if (kullaniciadi.equals("orhan") && sifre.equals("acikgoz")) {
              System.out.println("Yapmak istediginiz islemi seciniz: ");
              System.out.print("1) Para Cekme \n2)Para Yatirma \n3)Bakiye Sorgulama \n4)Cikis Yap");
              secim = inp.nextInt();
              if (secim == 1) {
                  System.out.println("Cekmek istediginiz miktari girin: ");
                  secim2 = inp.nextInt();
                  if (bakiye > secim2) {
                      System.out.println("Para cekme islemi bsarili" + "Yeni bakiyeniz: " + (bakiye - secim2));
                  } else {
                      System.out.println("Bakiye yetersiz.");
                  }
              }
              if (secim == 2) {
                  System.out.println("Yatırma istediginiz miktari girin: ");
                  secim3 = inp.nextInt();
                  System.out.println("Para yatirma islemi basarili. Yeni bakiyeniz: " + (secim3 + bakiye));
              }
              if (secim == 3) {
                  System.out.println("Guncel Bakiyeniz: " + bakiye);
              }
              if (secim == 4) {
                  System.out.println("Gorusmek Uzere Bye");
              }


          }else {
              hak--;
              System.out.println("Kullanici adinizi yanlis girdiniz.Kalan hakkiniz: "+ hak);
          }



        }}}

























