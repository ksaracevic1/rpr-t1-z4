public class Predmet {
    private Student[] niz;
    private int koliko;

    public void upisi(Student s) {
        niz[koliko++] = s;
    }

    public void ispisi(Student s) {
        for (int i = 0; i < koliko; i++) {
            if (niz[i] == s) {
                for (int j = i; j < broj - 1; j++) {
                    niz[j] = niz[j + 1];
                }

            }

        }
        koliko--;
    }

    boolean equals(Predmet p) {
        for (int i = 0; i < broj; i++) {
            if (p.niz[i] != this.niz[i])
                return false;
        }
        if (p.koliko != this.koliko) return false;
        if (p.naziv != this.naziv) return false;
        if (p.sifra != this.sifra) return false;
        return p.broj == this.broj;
    }

    private String naziv;
    private int sifra;
    private int broj;

    public Predmet(Student[] niz1, String naziv, int sifra, int broj) {
        koliko = niz1.length;
        this.niz = new Student [broj];
        for (int i=0; i<niz1.length; i++)
            niz[i]= niz1[i];
        this.naziv = naziv;
        this.sifra = sifra;
        this.broj = broj;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getSifra() {
        return this.sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public int getBroj() {
        return this.broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String toString() {

        int brojac = 0;
        for (Student s1 : niz) {
            System.out.println(brojac + 1 + " ");
            System.out.println(s1);
            brojac++;
        }
        return " " ;
    }
}