import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testKonstruktora() {
        Student s = new Student("Kenan","Saracevic",17912);
        assertEquals(s.toString(), "Saracevic Kenan (17912)");
    }

//
    @Test
    void testgetIme() {
        Student s = new Student("Kenan","Saracevic",17912);
        assertEquals(s.getIme(), "Kenan");
    }

    @Test
    void setIme() {
        Student s = new Student("Kemal","Saracevic",17912);
        s.setIme("Kenan");
        assertEquals(s.getIme(), "Kenan");

    }

    @Test
    void getPrezime() {
        Student s = new Student("Kemal","Mesic",17912);
        assertEquals(s.getPrezime(), "Mesic");
        s.setPrezime("Saracevic");
        assertEquals(s.getPrezime(), "Saracevic");
    }

    @Test
    void getBroj() {
        Student s = new Student("Kemal","Mesic",17911);
        assertEquals(s.getBroj(), 17911);
        s.setBroj(17912);
        assertEquals(s.getBroj(), 17912);
    }




    //Zasto ovo ne moze?

    @Test
    void equals() {
        Student s = new Student ("k", "s", 22);
        Student s1 = new Student ("k", "s", 22);
        assertEquals(s1.equals(s), true);
        s.setIme("s");
        assertEquals(s1.equals(s), false);
        s.setIme("k");
        s.setPrezime("k");
        assertEquals(s1.equals(s), false);
        s.setPrezime("s");
        s.setBroj(33);
        assertEquals(s1.equals(s), false);
    }

    @Test
    void main() {
    }
}