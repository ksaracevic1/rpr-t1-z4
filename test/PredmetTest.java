import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void upisi() {
        Student s = new Student ("k1", "k1", 22);
        Student s1 = new Student ("k2", "k2", 23);
        Student s2 = new Student ("k3", "k3", 24);
        Student[] niz ={ s, s1};
        Predmet p = new Predmet ( niz, "mlti", 11, 20 );
        p.upisi(s2);

        assertEquals("1. k1 k1 (22)\n2. k2 k2 (23)\n3. k3 k3 (24)", p.toString());
    }

    @Test
    void testKonstruktora() {
        Student s = new Student ("k", "s", 22);
        Student s1 = new Student ("k1", "k2", 23);
        Student[] niz ={ s, s1};
        Predmet p = new Predmet ( niz, "mlti", 11, 20 );
        assertEquals(p.toString(),  "1. s k (22)\n" +
                "2. k2 k1 (23)");
        assertEquals(p.getBroj(), 20);
        assertEquals( p.getNaziv(), "mlti");
        assertEquals(p.getSifra(), 11);
    }


    @Test
    void equals() {
        Student s = new Student ("k", "s", 22);
        Student s1 = new Student ("k1", "k2", 23);
        Student[] niz ={ s, s1};
        Predmet p = new Predmet ( niz, "mlti", 11, 20 );

        Student t = new Student ("k", "s", 22);
        Student t1 = new Student ("k1", "k2", 23);
        Student[] niz1 ={ t, t1};
        Predmet q = new Predmet ( niz1, "mlti", 11, 20 );

        assertEquals(p.equals(q), true);
        p.ispisi(s);
        assertEquals(p.equals(q), false);
        p.upisi(s);
        p.setBroj(40);
        assertEquals(p.equals(q), false);
        p.setBroj(20);
        p.setNaziv("dm");
        assertEquals(p.equals(q), false);
        p.setNaziv("mlti");
        p.setSifra(10);
        assertEquals(p.equals(q), false);

    }


}