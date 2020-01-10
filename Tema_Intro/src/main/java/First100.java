public class First100 {
    public static void main(String[] args) {
        suma();
    }

    public static void suma(){
        int suma = 0;
        for (int i = 1; i < 101; i++){
            suma = suma + i;
        }
        System.out.println("suma primelor 100 nr este: "+ suma);
    }
}
