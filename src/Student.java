public class Student {
private String ime, prezime;
private int broj;

public Student (String ime, String prezime, int broj) {
    this.ime = ime;
    this.prezime = prezime;
    this.broj = broj;
}
    public String getIme() { return this.ime; }
    public void setIme(String ime) { this.ime = ime;  }
    public String getPrezime() { return this.prezime; }
    public void setPrezime(String prezime) { this.prezime = prezime;  }
    public int getBroj() { return this.broj; }
    public void setBroj(int broj) { this.broj = broj;  }
    public String toString() {
        return  getPrezime() + " " + getIme() + " (" + getBroj() + ")";
    }
    boolean equals(Student p){
        if (p.ime != this.ime)return false;
        if (p.prezime != this.prezime)return false;
        if (p.broj != this.broj)return false;
        return true;
    }
    public static void main(String[] args) {
	// write your code here
    }
}
