public class MainDreptunghi {
    public static void main(String[] args) {
        Dreptunghi dreptA = new Dreptunghi(20.0, 10.0);
        System.out.println("Aria obiectului este: " + dreptA.getArie());
        System.out.println("Perimetrul obiectului este: " + dreptA.getPerimetru());

        Dreptunghi dreptB = new Dreptunghi(40.0, 40.0);
        System.out.println("Diagonala obiectului este: " + dreptB.getDiagonala());
    }
}
