public class Computer implements IDable{

    private String Id;
    private String make;
    protected Memory memory;


    public Computer(){
        setId(Id);
        setMake(make);

        Memory memory = new Memory();
        setMemory(type,size);
    }


    public String getId() {
        return Id;
    }

    public String getMake() {
        return make;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }


    public String toString() {
        return "ID : "+Id+"\nMake : "+make;
    }
}
