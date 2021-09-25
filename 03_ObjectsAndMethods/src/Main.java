public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");

        Arithmetic newData = new Arithmetic();
        newData.InitialData(5, 9);

        System.out.println(newData.getSum());
        System.out.println(newData.getMultiplication());
        System.out.println(newData.getMax());
        System.out.println(newData.getMin());

        Printer printer = new Printer();

        printer.append("Ha-Ha-Ha-Ha-Ha-Ha", "Joke", 1);
        printer.append("name", 15);
        printer.append("new", 12);
        //printer.clear();
        printer.print();
        System.out.println(printer.getPendingPagesCount());

        System.out.println(printer.getAllPages());

    }
}
