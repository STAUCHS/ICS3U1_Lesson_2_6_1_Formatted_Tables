class CurrencyDemo extends ConsoleProgram {

/**
  * Description
  * Demonstration of showing currency values
  * @author: E. Fabroa
  */

  
  public void run() {
    // Declare variables
    double dblSubtotal;
    double dblTax;
    double dblTotal;

    // Assign values to Subtotal and tax
    dblSubtotal = 9.99;
    dblTax = 0.13;

    // Calculate total
    dblTotal = dblSubtotal + (dblSubtotal * dblTax);

    System.out.println("The total is $" + Math.round(dblTotal));
  }
}