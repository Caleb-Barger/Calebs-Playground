package local.barge;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    protected final double LETTUCE_PRICE = .75;
    protected final double TOMATO_PRICE = .50;
    protected final double CUCUMBER_PRICE = .25;
    protected final double CHEESE_PRICE = 1.00;
    protected final double WHEAT_PRICE = 2.00;
    protected final double WHITE_PRICE = 1.00;
    protected final double PORK_PRICE = 1.00;
    protected final double CHICKEN_PRICE = 2.00;
    protected final double BISON_PRICE = 4.00;
    protected final double BEEF_PRICE = 1.00;

    private BreadType breadType;
    private MeatType meatType;
    private List<ToppingType> toppings = new ArrayList<>();
    private double totalPrice;
    private String name;

    public Hamburger(BreadType breadType, MeatType meatType, String name) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.name = name;

        switch (breadType) {
            case WHEAT:
                totalPrice += WHEAT_PRICE;
                break;
            case WHITE:
                totalPrice += WHITE_PRICE;
                break;
            default:
                break;
        }

        switch (meatType) {
            case PORK:
                totalPrice += PORK_PRICE;
                break;
            case CHICKEN:
                totalPrice += CHICKEN_PRICE;
                break;
            case BISON:
                totalPrice += BISON_PRICE;
                break;
            case BEEF:
                totalPrice += BEEF_PRICE;
                break;
            default:
                break;
        }
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public List<ToppingType> getToppings() {
        updatePrice();
        return toppings;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String toppingsString = "";
        String breadString = "";
        String meatString = "";

        switch (breadType) {
            case WHEAT -> breadString = "WHEAT - $" + WHEAT_PRICE + "\n";
            case WHITE -> breadString = "WHITE - $" + WHITE_PRICE + "\n";
        }

        switch (meatType) {
            case BISON -> meatString = "BISON - $" + BISON_PRICE + "\n";
            case BEEF -> meatString = "BEEF - $" + BEEF_PRICE + "\n";
            case PORK -> meatString = "PORK - $" + PORK_PRICE + "\n";
            case CHICKEN -> meatString = "CHICKEN - $" + CHICKEN_PRICE + "\n";
        }

        for (ToppingType t : toppings) {
            switch (t) {
                case LETTUCE:
                    toppingsString += "LETTUCE - $" + LETTUCE_PRICE + "\n";
                    break;
                case CHEESE:
                    toppingsString += "CHEESE - $" + CHEESE_PRICE + "\n";
                    break;
                case TOMATO:
                    toppingsString += "TOMATO - $" + TOMATO_PRICE + "\n";
                    break;
                case CUCUMBER:
                    toppingsString += "CUCUMBER - $" + CUCUMBER_PRICE + "\n";
                    break;
            }
        }
        return name + ":" + "\n" +
                breadString +
                meatString +
                toppingsString + "--------------" +
                "\nGRAND TOTAL - $" + totalPrice;
    }

    private void updatePrice() {
        for (ToppingType t : toppings) {
            switch (t) {
                case LETTUCE:
                    totalPrice += LETTUCE_PRICE;
                    continue;
                case TOMATO:
                    totalPrice += TOMATO_PRICE;
                    continue;
                case CUCUMBER:
                    totalPrice += CUCUMBER_PRICE;
                    continue;
                case CHEESE:
                    totalPrice += CHEESE_PRICE;
                    continue;
                default:
                    break;
            }
        }
    }
}
