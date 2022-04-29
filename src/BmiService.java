public class BmiService {
    public double calculate (double height, int weight) {
        double bmi = weight / ((height * height) / 10_000);
        return Math.round (bmi * 100.0) / 100.0;
    }
}
