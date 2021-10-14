public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40,2,10);
        //basket.print("Milk");

        System.out.println(basket.getCount());

        basket.add("meat", 20, 3, 20);

        System.out.println(basket.getCount());

        Basket basket1 = new Basket();
        basket1.add("Beer", 20, 5, 14.2);
        //basket1.print("Beer");
        //System.out.println(basket1.getTotalWeight());
        System.out.println(Basket.getAllBasketsPrice() + " " + Basket.getAllCount() + " " +
                Basket.getCount());
        System.out.println(Basket.getAverageGoodsPrice() + " " + Basket.getAverageBasketsPrice());

        /*Arithmetic newData = new Arithmetic();
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

        System.out.println(printer.getAllPages());*/

    }
}
