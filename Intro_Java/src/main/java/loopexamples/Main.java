package loopexamples;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = {10, 20, 30, 40, 50, 60};

        //afisare elemente array
        afisareArray(arrayInt);
    }

    public static void afisareArray(int[] arrayInt) {
        for (int elem : arrayInt){
            System.out.println(elem);
        }

        //calcul suma in functie de conditii
        //daca elem din array == 30, nu se va calcula suma
        //daca suma > 100 se intrerupe executia arrayului

        int sum = sumaNrArray(arrayInt);
        System.out.println("am iesit din FOR iar suma este: " + sum);
    }

    public static int sumaNrArray(int[] arrayInt) {
        int sum = 0;
        for (int elem : arrayInt){
            if (elem == 30){
                continue;
            }
            if (sum > 100){
                break;
            }

            sum += elem;
            System.out.println("elem: " + elem + "suma: " + sum);

        }
        return sum;
    }
}
