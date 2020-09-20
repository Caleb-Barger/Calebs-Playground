package printer;

public class Printer {
    private float tonnerLevel;
    private long pagesPrinted;
    private boolean isDuplex;

    public Printer(float tonnerLevel, boolean isDuplex) {
        this.tonnerLevel = tonnerLevel;
        this.isDuplex = isDuplex;
    }

    public float getTonnerLevel() {
        return tonnerLevel;
    }

    public void setTonnerLevel(float tonnerLevel) {
        this.tonnerLevel = tonnerLevel;
    }

    public long getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(long pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public void fillToner() {
        System.out.println("Filling Tonner....");
        this.tonnerLevel = 100f;
    }

    public void printPage() {
        System.out.println("Printing Page!");
        this.setTonnerLevel(this.tonnerLevel-1f);
        System.out.println("Tonner Level - " + this.tonnerLevel);
        this.setPagesPrinted(this.pagesPrinted+1);
        System.out.println("Pages Printed - " + this.pagesPrinted);
    }
}
