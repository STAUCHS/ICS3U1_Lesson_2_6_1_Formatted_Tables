class KmTOMiles1 extends ConsoleProgram {

  /**
  * Description
  * A program that converts kilometers to miles from 10 to 100km, every 10km
  * @author: E. Fabroa
  */
  
  public void run() {

    double dblMiles;

    for (int intKm = 10; intKm <= 100; intKm += 10){
      dblMiles = intKm * 0.621371;
      System.out.println(intKm + "km --> " + dblMiles + "mi");

    }
  }
}
