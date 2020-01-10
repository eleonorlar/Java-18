public class MainLight {
    public static void main(String[] args) {
        System.out.println("Bec 1:");
        Light bec1 = new Light(5);
        bec1.on();
        bec1.off();
        bec1.brighten();

        System.out.println("Bec 2:");
        Light bec2 = new Light(20);
        bec2.brighten();
        bec2.brighten();
        bec2.dim();

    }
}
