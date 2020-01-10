package Aggregation;

public class MainMasina {
    // masina VW de culoare alba cu motor de 1 si putere 75
    //AFISAM MESAJUL: Masina X are culoarea Y cu motorul de putere Z si capacitate T
    public static void main(String[] args) {
        Motor motorVW = new Motor();
        motorVW.setCapacitate(1);
        motorVW.setPutere(75);

        System.out.println("MotorVW are puterea: " + motorVW.getPutere());
        System.out.println("MotorVW are capacitatea: " + motorVW.getCapacitate());

        Masina masinaVW = new Masina(motorVW, "VW");
        masinaVW.setCuloare("ALB");

        System.out.println("Masina " + masinaVW.getNume() + " are culoarea "
                + masinaVW.getCuloare() + " cu motorul de putere "
                + masinaVW.getMotor().getPutere() + " si capacitate "
                + masinaVW.getMotor().getCapacitate());

        masinaVW = null;

        //aggregation raspunde la intrebarea HAS A

    }
}
