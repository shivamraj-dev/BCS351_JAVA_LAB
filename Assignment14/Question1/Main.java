// Name: Shivam raj
// Roll Number: 2510303488
// ID: BCS2025536
class Main {
    public static void main(String[] args) {
        String s = "programming";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
        }
        System.out.println("Vowels: " + count);
    }
}
