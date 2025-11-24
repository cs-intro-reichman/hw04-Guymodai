public class Primes {
    public static void main(String[] args) { 

        int range = Integer.parseInt(args[0]);
        boolean[] all_primes = new boolean[range + 1];
        for (int i = 2; i <= range; i++) {
            all_primes[i] = true;
        }

        for (int i = 2; i <= range; i++) {
            if (all_primes[i]) {
                int j = i + i;
                while (j <= range) {
                    all_primes[j] = false;
                    j = j + i;
                }
            }
        }

        System.out.println("Prime numbers up to " + range + ":");
        int counter = 0;
        for (int i = 2; i <= range; i++) {
            if (all_primes[i]) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("There are " + counter + " primes between 2 and " + range + " (" + (int)(((double)counter/range)*100) + "% are primes)");
    }
}