package calculator;

public class Calculator {
    public static void main(String[] args) {
        // args 1 * 2

        if (args.length < 3) {
            System.out.println("Trebuie sa avem o sintaxa ca in ex: 1 * 2");
        } else {
            int nr1 = Integer.parseInt(args[0]);
            int nr2 = Integer.parseInt(args[2]);
            String operator = args[1];

            calculeaza(nr1, nr2, operator);
        }
    }

    /**
     *
     * @param nr1
     * @param nr2
     * @param operator
     */
    private static void calculeaza(int nr1, int nr2, String operator) {
        switch (operator.charAt(0)){
            case '+':
                int suma = nr1 + nr2;
                System.out.println(suma);
                break;
            case '-':
                int dif = nr1 - nr2;
                System.out.println(dif);
                break;
            case '*':
                int inm = nr1 * nr2;
                System.out.println(inm);
                break;
            case '/':
                int imp = nr1 / nr2;
                System.out.println(imp);
                break;
            default:
                System.out.println("mai incearca!");
        }
    }
}
