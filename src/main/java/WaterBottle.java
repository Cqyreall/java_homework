public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int drink(){
        this.volume -= 10;
        return this.volume;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }
}
