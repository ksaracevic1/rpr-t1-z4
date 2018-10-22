public class Program {
    public static void main(String[] args) {
        // kreiranje novog predmeta,
        // novog studenta,
        // upis studenta na predmet,
        // ispis studenta sa predmeta,
        // brisanje studenta,
        // brisanje predmeta,
        // te ispis spiska studenata na predmetu.

        // Testiranje studenta


        Student s = new Student ("k", "s", 22);
        System.out.println(s);
        //testiranje getera
        s.setIme("k1") ;
        s.setPrezime("k2")  ;
        s.setBroj(23) ;
        System.out.println(s);
        Student s1 = new Student ("k1", "k2", 23);
        System.out.println(s1.equals(s)); //jednaki su
        Student[] niz ={ s, s1};
        Student s3 = new Student ("krle", "krle", 24);

        Predmet p = new Predmet ( niz, "mlti", 11, 20 );
        System.out.println(p);
        p.upisi(s1);
        System.out.println(p);
        p.ispisi(s1);
        p.toString();
        System.out.println(p);
        p.toString();








    }


}
