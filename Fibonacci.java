public class Fibonacci {

    // Méthode récursive pour calculer le n-ième nombre de Fibonacci
    public static int fibonacci(int n) {
        // Cas de base
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Cas récursif
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        // Tester la fonction Fibonacci avec différents indices
        System.out.println("F(0) = " + fibonacci(0));
        System.out.println("F(1) = " + fibonacci(1));
        System.out.println("F(5) = " + fibonacci(5));
        System.out.println("F(10) = " + fibonacci(10));
    }
}
