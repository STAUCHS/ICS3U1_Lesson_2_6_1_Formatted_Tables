class KmTOMiles2 extends ConsoleProgram {

  /**
  * Description
  * A program that converts kilometers to miles from 10 to 100km, every 10km
  * @author: E. Fabroa
  */
  
  public void run() {

    double dblMiles;

    // output table header
    System.out.printf("%5s %10s %n", "Km", "Miles");
    System.out.println("------------------");

    for (int intKm = 10; intKm <= 100; intKm += 10){
      dblMiles = intKm * 0.621371;
      System.out.printf("%5d %10.2f %n", intKm, dblMiles);

    }
  }
}
