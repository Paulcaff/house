public class Laptop extends Computer{

    private boolean touchScreen;



    public Laptop(String make, String Id, String type, int size, boolean touchScreen) {
        super(make, Id, type, size);
        this.touchScreen = touchScreen;
    }

    public Laptop(String id, String make, Memory memory, boolean touchScreen) {
        super(id, make, memory);
        this.touchScreen = touchScreen;
    }


    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }
}
