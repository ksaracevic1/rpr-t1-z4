import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void upisi() {
        // PRedmet vec postoji
        Program pr = new Program();
        Student s = new Student ("k1", "k1", 22);
        Student s1 = new Student ("k2", "k2", 23);
        Student[] niz ={ s, s1};
        Predmet p = new Predmet ( niz, "mlti", 11, 20 );
        pr.upisi(p);

        assertThrows(IllegalArgumentException.class, () -> {     pr.upisi(p);});
    }

    @Test
    void ispisi() {
        // Predemet ne postoji !
        Program pr = new Program();
        Student s = new Student ("k1", "k1", 22);
        Student s1 = new Student ("k2", "k2", 23);
        Student[] niz ={ s, s1};
        Predmet p = new Predmet ( niz, "mlti", 11, 20 );
        assertThrows(IllegalArgumentException.class, () -> {     pr.ispisi(p);});
    }



}