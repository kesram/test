package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException();
        }
        return a/b;
    }

    /**
     * This main can throw ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try{
            double result = firstChallenge.divide(3,0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Błąd odczytu pliku: " + e);
        } finally {
            System.out.println("\n" + "Jeśli zero chcesz pod kreskę, Wstawić w święto przy niedzieli, Przynieś kredę," +
                    " czarną deskę. Pisz: przez zero się nie dzieli!");
        }
    }
}
