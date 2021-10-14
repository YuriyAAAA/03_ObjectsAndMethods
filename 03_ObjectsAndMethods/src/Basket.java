public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;



    private static int goodsCount; //переменная для хранения общего количества товаров во всех корзинах
    private static int allBasketsPrice; //переменная для хранения общей стоимости всех товаров во всех корзинах

    private static void allCount(int goodsCount) {
        Basket.goodsCount = Basket.goodsCount + goodsCount;
    } //метод, считающий общее количество товаров во всех корзинах
    private static void setAllBasketsPrice(int allBasketsPrice) {
        Basket.allBasketsPrice = Basket.allBasketsPrice + allBasketsPrice;
    } //метод, считающий общую цену товаров во всех корзинах

    public static int getAllCount(){
        return goodsCount;
    } //метод, возвращающий общее количество товаров во всех корзинах
    public static int getAllBasketsPrice() {
        return allBasketsPrice;
    } //метод возвращающий общую цену всех товаров во всех корзинах
    public static double getAverageGoodsPrice(){
        double averageGoodsPrice = allBasketsPrice/goodsCount;
        return averageGoodsPrice;
    }// метод возвращающий среднюю стоимость товаров во всех корзинах
    public static double getAverageBasketsPrice() {
        double averageBasketsPrice = allBasketsPrice/count;
        return averageBasketsPrice;
    }//метод возвращающий среднюю стоимость корзин

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        increaseCount(1);
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        increaseCount(1);
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {

        add(name, price, 1);
        allCount(1);
        setAllBasketsPrice(price);

    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
        allCount(count);
        setAllBasketsPrice(price*count);
    }

    public void add(String name, int price, int count, double weight) {
        items = items + "\n" + name + " - " + count + " шт. - " + weight + "кг."+ price;
        totalWeight +=weight;
        allCount(count);
        setAllBasketsPrice(price*count);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {return totalWeight; }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
