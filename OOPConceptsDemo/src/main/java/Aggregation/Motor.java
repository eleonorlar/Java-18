package Aggregation;

public class Motor {
    //atribute
    private int putere;
    private double capacitate;

    //constructor
    public Motor() {
        this.putere = 75;
        this.capacitate = 0.8;
    }

    //metode
    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        if (putere < 75) {
            System.out.println("NU PUTETI INTRODUCE O VALOARE MAI MICA DECAT 75");
        } else {
            this.putere = putere;
        }
    }

    public double getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(double capacitate) {
        if (capacitate < 0.8) {
            System.out.println("NU PUTETI INTRODUCE O VALOARE MAI MICA DECAT 0.8");
        } else {
            this.capacitate = capacitate;
        }
    }
}