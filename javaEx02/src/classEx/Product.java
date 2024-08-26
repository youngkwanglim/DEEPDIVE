package classEx;

public class Product {
    private String num;
    private String name;
    private int price;
    private String maker;
    private String Date;
    private int stock;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "상품번호 : " + num
                + "\n상품명 : " + name
                + "\n가격 : " + price
                + "\n제조회사 : " + price
                + "\n제조일 : " + price
                + "\n재고 : " + price;
    }
}
