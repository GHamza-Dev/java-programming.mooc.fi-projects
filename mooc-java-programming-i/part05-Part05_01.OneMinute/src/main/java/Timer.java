public class Timer {

    private ClockHand handredthsOfSecond;
    private ClockHand secods;

    public Timer(){
        this.handredthsOfSecond = new ClockHand(100);
        this.secods = new ClockHand(60);
    }

    public void advance(){
        this.handredthsOfSecond.advance();
        if (handredthsOfSecond.value() == 0) {
            this.secods.advance();
        }
    }

    public String toString(){
        String seconds = secods.value() < 10 ? "0"+secods.value() : secods.value()+"";
        String hOfs = handredthsOfSecond.value() < 10 ? "0"+handredthsOfSecond.value() : handredthsOfSecond.value()+"";
        return seconds+":"+hOfs;
    }

}
