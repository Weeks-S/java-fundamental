public class Variable {
    public static void main(String[] args) {
        int num, num2, num3;
        num = 3;
        num2 = 8;
        num3 = num + num2;
        String kalimat = "jumlah";
        final double PI = 3.14;
        int rad = 32;
        double circumference = 2 * PI * rad;

        System.out.printf("The circumference is: %f", circumference);

        System.out.println(num + num2 + num3);
        System.out.printf("%s : %d + %d = %d", kalimat, num, num2, num3);
    }
}
