public class Main {
    public static void main(String[] args) {

        double canNang = 40;
        double chieuCao = 1.5;

        double bmi = bmiCalcu(chieuCao, canNang);
        System.out.println("\nKet qua bmi cua ban la: " + bmi);
        System.out.printf("Ket qua bmi cua ban la %.1f", bmi);
        System.out.printf("\nCan nang: %.1f, chieu cao: %.1f, bmi: %.2f", canNang, chieuCao, bmi);

    }

    public static double bmiCalcu(double height, double weight) {
        return weight / (height * height);
    }
}