public class House {
    private String address;
    private String type;
    private double price;
    private Person owner;

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Person getOwner() {
        return owner;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public House(){
        this.address = "No Address Specified";
        this.type = "No Type Specified";
        this.price = 0.0;

        Person owner = new Person();

        this.owner = owner;
    }

    public House(String address,String type,double price, String personName,int personage ){
        setAddress(address);
        setType(type);
        setPrice(price);

        Person owner = new Person(personName,personage);

        setOwner(owner);


    }

    public String toString(){
        return "Address: "+address+ "\nType: "+type+"\nPrice: "+price+"\nOwner Name: "+owner.getName()+"\nOwner Age: " +owner.getAge();
    }
}
