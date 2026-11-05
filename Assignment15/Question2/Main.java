// Name: Shivam raj
// Roll Number: 2510303488
// ID: BCS2025536
class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) sb.append(i).append(",");
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
