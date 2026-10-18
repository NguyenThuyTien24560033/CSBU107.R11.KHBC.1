class Dice {
    private int value;

    public Dice() {
        this.value = 1;
    }

    public int roll() {
        this.value = (int) (Math.random() * 6) + 1;
        return this.value;
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        int n = 100000;
        int[] frequencies = new int[7];

        for (int i = 0; i < n; i++) {
            int result = dice.roll();
            frequencies[result]++;
        }

        System.out.println("  Dice Rolling Experiment ");
        for (int i = 1; i <= 6; i++) {
            double probability = (double) frequencies[i] / n;
            System.out.printf("Face %d: Count = %6d | Probability = %.4f (%.2f%%)%n", 
                              i, frequencies[i], probability, probability * 100);
        }
    }
}