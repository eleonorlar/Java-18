package Aggregation;

public class Masina {
    //atribute
    private String culoare;
    private String nume;
    private Motor motor;

    //constructor
    public Masina(Motor motor, String nume){
        this.nume = nume;
        this.culoare = "ALB";
        this.motor = motor;
    }

    //metode
    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
