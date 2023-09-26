public class Exo3PrimeNumbers {

    public Exo3PrimeNumbers() {
        System.out.println("Enter max number for searching primes");
        int max = StarterClass.scan.nextInt();
        //Don't forget to flush the buffer
        StarterClass.scan.nextLine();

        searchPrimesBruteForce(max);
        searchPrimesSmart(max);
    }

    private void searchPrimesSmart(int max) {
        long now = System.currentTimeMillis();
        long duration = (System.currentTimeMillis() - now) / 1000;
        int nb = 1;
        for (int i = 3; i < max; i++) {
            if (isPrimeSmarte(i)) {
                nb++;
            }
        }
        System.out.println();
        System.out.println("Found : " + nb + ", it took " + duration + " sec");
    }

    private boolean isPrimeSmarte(int i) {
        if (i%2 == 0) return false;
        if(i==3) return true;
        for (int j = 3; j < Math.sqrt(i)+1; j+=2) {
            if (i % j == 0)
                return false;
        }
        return true;
    }

    private void searchPrimesBruteForce(int max) {
        long now = System.currentTimeMillis();
        System.out.print(2 + ", ");
        int nb = 1;
        for (int i = 3; i < max; i++) {
            if (isPrimeBruteForce(i)) {
                nb++;
                //System.out.print(i + ", ");
            }
        }

        long duration = (System.currentTimeMillis() - now) / 1000;
        System.out.println();
        System.out.println("Found : " + nb + ", it took " + duration + " sec");
    }

    private boolean isPrimeBruteForce(int i) {
        boolean isPrime = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0)
                isPrime = false;
        }
        return isPrime;
    }
}
