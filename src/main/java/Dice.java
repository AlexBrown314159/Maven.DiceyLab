import javax.print.attribute.IntegerSyntax;

public class Dice {
    private Integer numberOfDie;

    public Dice(Integer n) {
        if (n < 1) {
            System.out.println("Number of die must be greater than zero!");
            n = 1;
        }
        this.numberOfDie = n;
    }

    public Integer tossAndSum() {
        Integer iTotal = 0;

        for (Integer i = 0; i < numberOfDie; i++) {
            iTotal = iTotal + (int) Math.round(1 + (5.0 * Math.random()));
        }

        return iTotal;
    }















}
