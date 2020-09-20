package printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(100, false );
        int i = 0;
        while (i < 100) {
            printer.printPage();
            i++;
        }

    }

}
