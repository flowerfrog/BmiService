public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double result = service.calculate(60, 168);
        System.out.println("ИМТ = " + result);
    }
}