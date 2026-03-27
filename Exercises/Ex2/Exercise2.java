import java.math.BigDecimal;

/**
 * CONCEPT: Encapsulation and Financial Logic
 * Python does not enforce strict access modifiers (using underscores is merely convention). 
 * Java uses `private`, `protected`, and `public` to enforce encapsulation at the compiler level.
 * This protects internal state (like a principal balance) from arbitrary external modification.
 * Note: BigDecimal is standard for financial calculations in Java to prevent floating-point precision loss.
 *
 * TASK: Complete the LoanAccount class.
 * 1. Create a public constructor that initializes 'principal' and 'interestRate'.
 * 2. Create a public getter method that returns the current 'principal'.
 * 3. Create a public method 'applyInterest' that calculates the interest due, adds it to the principal, 
 * and updates the principal variable.
 */
public class LoanAccount {
    private BigDecimal principal;
    private double interestRate;

    // TODO: Implement the constructor, getter, and applyInterest method here.
    
    public static void main(String[] args) {
        // TODO: Instantiate a LoanAccount with a principal of 1000.00 and an interest rate of 0.05.
        // Call applyInterest() and print the new principal.
    }
}