public class Dreptunghi {
    //attributes
    double lungime;
    double latime;

    //constructor
    public Dreptunghi(double lungime, double latime){
        this.lungime = lungime;
        this.latime = latime;
    }

    //methods
    public double getArie(){ return lungime * latime; }

    public double getPerimetru(){ return 2 * (lungime + latime); }

    public double getDiagonala(){ return Math.sqrt(lungime * lungime + latime * latime); }
}
