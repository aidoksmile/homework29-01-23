package solid.lsp;

public abstract class Order implements Orderable{
    protected int price;
    protected int qnt;

    public int getPrice() {
        return price;
    }

    public int getQnt() {
        return qnt;
    }

    public Order(int price, int qnt) {
        this.price = price;
        this.qnt = qnt;
    }

}
