class CurrencyDemo extends ConsoleProgram {

/**
  * Description
  * Demonstration of showing currency values
  * @author: E. Fabroa
  */

  
  public void run() {

    double dblSubtotal = 9.99;
    double dblTax = 0.13;
  
    double dblTotal;

    dblTotal = dblSubtotal + (dblSubtotal * dblTax);
    System.out.printf("The total is $%.2f%n",dblTotal);



    

    
    
  }
}