// Name: Shivam raj
// Roll Number: 2510303488
// ID: BCS2025536
class Main {
    public static void main(String[] args) {
        int[] a = {6, 5, 4, 3, 2, 1};
        int shifts = 0;
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) { 
                a[j + 1] = a[j]; 
                j--; 
                shifts++; 
            }
            a[j + 1] = key;
        }
        System.out.println("Shifts: " + shifts);
    }
}
