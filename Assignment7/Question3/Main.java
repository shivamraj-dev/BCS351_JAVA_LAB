// Name: Shivam raj
// Roll Number: 2510303488
// ID: BCS2025536
class Main {
    public static void main(String[] args) {
        // Time Complexity: O(log n)
        int n = 1024, steps = 0;
        while (n > 1) { n /= 2; steps++; }
        System.out.println("Halving steps: " + steps);
    }
}
