package loopexamples;

public class Nrinvers {
    public static void main(String[] args) {

        int nr = 123456;
        System.out.println("nr:"+nr);
        inversareNr(nr);

        String propozitie = "Ana are mere";
        afisareCaractereSiNrVocale(propozitie);
    }

    public static void afisareCaractereSiNrVocale(String propozitie) {
        char[] arrayCaractere = propozitie.toCharArray();
        int nrvoc = 0;
        for (char el: arrayCaractere){
            if (el == 'a' || el == 'e' || el == 'i' || el == 'o' || el == 'u' || el == 'A' || el == 'E' || el == 'I' || el == 'O' || el == 'U') {
                nrvoc++;
            }
        }
        System.out.println(nrvoc);
    }

    public static void inversareNr(int nr) {
        int inv = 0;
        do{
            inv = inv * 10 + nr % 10;
            nr = nr / 10;
        } while (nr > 0);

        System.out.println("inv:"+inv);
    }
}
