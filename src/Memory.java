public class Memory {

    private String type;
    private int size;

    public Memory(){
        setSize(size);
        setType(type);
    }


    public Memory(String type, int size){
        this.type= type;
        this.size= size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String toString() {
        return "Size : "+size+"\nType"+type;
    }
}
