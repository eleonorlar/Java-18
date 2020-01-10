public class Smallest {
    public static void main(String[] args) {
        int[] arrayInt = {70, 20, 30, 10, 50, 60};
        small(arrayInt);
    }

    public static void small(int[] arrayInt){
        int m = Integer.MAX_VALUE;
        for (int elem :  arrayInt){
            if (elem < m){
                m = elem;
            }
        }

        System.out.println(" cel mai mic elem din sir este: "  + m);
    }
}
