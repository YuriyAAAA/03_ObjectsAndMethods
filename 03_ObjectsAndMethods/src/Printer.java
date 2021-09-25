public class Printer {
    private String queue = "";
    private int sum = 0;
    private int pages;

    public void append (String text) {
        queue += text;
    }

    public void append (String text, String name, int quantity) {
        queue += text + " " + name + " " + quantity;
        sum += quantity;
    }

    public void append (String text, String name) {
        queue += text + " " + name;
    }

    public void append (String text, int quantity) {
        queue += text + " " + quantity;
        sum += quantity;
    }

    public void clear () {
        queue = "";
    }

    public void print () {
        if (queue.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(queue);
            queue = "";
            pages += sum;
            sum = 0;
        }

    }

    public int getPendingPagesCount () {
        return sum;
    }

    public int getAllPages () {
        return pages;
    }
}
