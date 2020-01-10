package Containment;

public class Cladire {
    private String nume;
    private Camera camera;

    public Cladire(String nume){
        this.nume = nume;
        this.camera = new Camera();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Camera getCamera() {
        return camera;
    }
}
