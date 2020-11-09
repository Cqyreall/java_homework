public class Runner {

    public static void main(String[] args) {
        WaterBottle water = new WaterBottle(100);
//        water.drink();
//        water.drink();
//        System.out.println(water.getVolume());
//        water.empty();
//        System.out.println(water.getVolume());
//        water.fill();
//        water.drink();
//        water.drink();
//        water.drink();
//        water.drink();
//        System.out.println(water.getVolume());

        Calculator calculate = new Calculator();
//        System.out.println(calculate.add(3, 2));
//        System.out.println(calculate.subtract(10, 3));
//        System.out.println(calculate.multiply(5, 300));
//        System.out.println(calculate.divide(3.6, 1.8));

        Printer operation = new Printer(100, 25);
        Printer newOperation = new Printer(15, 32);
        System.out.println(operation.print(10, 2));
        System.out.println(newOperation.print(8, 2));
        System.out.println(operation.getTonerVolume());

    }
}
