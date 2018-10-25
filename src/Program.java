import java.util.Scanner;

public class Program {
    Predmet [] niz;
    int koliko;
    public Program () {
        niz= new Predmet[100];
        koliko = 0;
    }
    public void upisi(Predmet p) {
        for (int i=0; i< koliko; i++)
        {
            if (p.equals(niz[i]) ) throw new IllegalArgumentException ("Proslijedjen predmet koji ne postoji!");
        }

        niz[koliko++] = p;
    }

    public void ispisi(Predmet s) {
        boolean x= false;
        for (int i = 0; i < koliko; i++) {
            if (niz[i].equals(s)) {
                x = true;
                for (int j = i; j < 99; j++) {
                    niz[j] = niz[j + 1];
                }
            }
        }
        koliko--;
        if (x==false )  throw new IllegalArgumentException ("Proslijedjen predmet koji ne postoji!");
    }






    public static void main(String[] args) {
        // kreiranje novog predmeta,
        // novog studenta,
        // upis studenta na predmet,
        // ispis studenta sa predmeta,
        // brisanje studenta,
        // brisanje predmeta,
        // te ispis spiska studenata na predmetu.

        // Testiranje studenta

        try {
            System.out.println("Odabreite opcije:" +
                    "1. Kreiranje novog predmeta" +
                    "2. Kreiranje novog studenta" +
                    "3. Upis studenta na predmet" +
                    "4. Ispis studenta za predmet" +
                    "5. Brisanje studenta" +
                    "6. Brisanje predmeta" +
                    "7. Ipis spiska studenata na predmetu"
            );

            Scanner ulaz = new Scanner(System.in);
            int n = ulaz.nextInt();
            if (n == 1) {
                Scanner ulaz1 = new Scanner(System.in);
                String naziv = ulaz1.nextLine();
                int sifra = ulaz.nextInt();
                int broj = ulaz.nextInt();

            }


            Student s = new Student("k", "s", 22);
            System.out.println(s);
            //testiranje getera
            s.setIme("k1");
            s.setPrezime("k2");
            s.setBroj(23);
            System.out.println(s);
            Student s1 = new Student("k1", "k2", 23);
            System.out.println(s1.equals(s)); //jednaki su
            Student[] niz = {s, s1};
            Student s3 = new Student("krle", "krle", 24);

            Predmet p = new Predmet(niz, "mlti", 11, 20);
            System.out.println(p);
            p.upisi(s1);
            System.out.println(p);
            p.ispisi(s1);
            p.toString();
            System.out.println(p);
            p.toString();

        }

        catch (Exception e) {

        }






    }


}
