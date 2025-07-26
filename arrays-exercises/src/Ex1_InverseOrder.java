public class Ex1_InverseOrder {
    public static void main(String[] args) throws Exception {
        int[] vetor = { 45, 2, 8, 6, -78, 5 };

        String reverseArray = "O vetor reverso é:";
        for (int c = (vetor.length - 1); c >= 0; c--) {
            reverseArray += " " + vetor[c];
        }
        System.out.println(reverseArray);
    }
}