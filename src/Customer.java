

public class Customer implements Comparable<Customer> {
    private String name;
    private String city;
    private float purchase;

    public Customer (String _name, String _city, float _purchase) {
        this.name = _name;
        this.city = _city;
        this.purchase = _purchase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getPurchase() {
        return purchase;
    }

    public void setPurchase(float purchase) {
        this.purchase = purchase;
    }

    public String toString() {
        return this.name + "; " + this.city + "; " + this.purchase;
    }

    @Override
    public int compareTo(Customer _cust) {
        if (this.purchase > _cust.purchase) {
            return 1;
        } else {
            return -1;
        }
    }
}


