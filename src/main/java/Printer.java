public class Printer {

    private int numberOfSheets;
    public int tonerVolume;

    public Printer(int numberOfSheets, int tonerVolume) {
        this.numberOfSheets = numberOfSheets;
        this.tonerVolume = tonerVolume;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public boolean print(int noOfPages, int noOfCopies){
        int paperValue;
        paperValue = noOfPages * noOfCopies;

        if(paperValue >= this.numberOfSheets || this.tonerVolume == 0){
            return false;
        }
        else{
            this.tonerVolume -= noOfPages;
            return true;
        }

    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void setTonerVolume(int tonerVolume) {
        this.tonerVolume = tonerVolume;
    }
}
