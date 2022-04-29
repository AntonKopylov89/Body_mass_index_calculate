public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 105; // в кг
        double height = 190; // в см
        double bmi = service.calculate(height, weight);
        System.out.println("Индекс массы тела: " + bmi + " кг/м^2");
    }
}
