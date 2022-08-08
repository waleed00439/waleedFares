public class aCustomer {
    private int id;
    private String name;
    private int discount;

    public aCustomer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.discount = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount){
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "aCustomer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                '}';
    }
}

