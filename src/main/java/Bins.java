import java.util.Arrays;

public class Bins {
    private Integer binMin;
    private Integer binMax;
    private Integer iTotal;

    Integer[] iBin;

    public Bins(Integer n, Integer m) {
        binMin = n;
        binMax = m;
        iBin = new Integer [binMax+1];
        Arrays.fill(iBin, 0);
        iTotal = 0;
    }

    public void incrementBin(Integer n) {
         iBin[n]++;
         iTotal++;
    }

    public void printOut() {
        String str;
        Integer m;
        double w, x, y, z;

      for (Integer i = binMin; i <= binMax; i++) {
            if (i < 10) {
                System.out.print(" ");
            }
      System.out.print(i + " : ");

            str = iBin[i].toString();
            for (Integer q = 0; q < 8-str.length(); q++) {
                System.out.print(" ");
            }


          System.out.print(str + ":");

          w = iBin[i];
          x = iTotal;
          z = w / x;

                  System.out.printf(" %-4.2f ", z);

                  z = 100  * z;
            m = (int) z;

          if (iBin[i] < 9999) {
              System.out.print("*");
          }
                  for (Integer q = 0; q < m; q++ ) {
                      System.out.print("*");
                  }


          System.out.println("");


      }


    }



/*

    Bins results = new Bins(2, 12); // for bins from 2..12

    Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin

    results.incrementBin(10); // should increment bin # 10

*/
//make a couple unit tests for the Bins class.








}
