package Containment;

public class MainCladire {
    public static void main(String[] args) {
        Cladire cladireA = new Cladire("CBC");
        //cladireA.setMarimeCamera(100);
        //cladireA.setCuloareCamera("ROSU");

        cladireA.getCamera().setMarime(100);
        cladireA.getCamera().setCuloare("ROSU");

        System.out.println(cladireA.getNume() + " are o camera de culoare " + cladireA.getCamera().getCuloare()
                + " si marimea de " + cladireA.getCamera().getMarime());
    }
}
