import java.util.Scanner;

/**
 * 
 * @author Mandy
 * 
 * The tuition calculator calculates the total cost of tuition to complete a degree. 
 * 
 * The method, totalTuitionCalculator calculates the total cost of tuition 
 * with a for loop. For each term, the initial tuition is increased by the the
 * Repayment APR times the total tuition. The Repayment APR is equal to the 
 * annual percentage rate added to the percent increase for tuition.
 * 
 * The user is prompted for the Initial Tuition Cost, the Percentage Increases for
 * Tuition, the Repayment APR, and the Term in order to calculate the total tuition value.
 *
 */

public class TuitionCalculator {
	
	public static void main(String[] args) {
		System.out.println("Input Initial Tuition Cost");
		Scanner keyboard = new Scanner(System.in);
		
		double initialTuition = keyboard.nextDouble();
		System.out.println("Input Percentage Increases for Tuition");
		double percentIncrease = keyboard.nextDouble();
		System.out.println("Input Repayment APR");
		double repaymentAPR = keyboard.nextDouble();
		System.out.println("Input Term");
		double term = keyboard.nextDouble();
		
		public static double totalTuitionCalculator(double initialTuition, double percentIncrease, double repaymentAPR, double term){
		double totalTuition = 0;
		for(term = 1; term == 4; term++){
			totalTuition = initialTuition+(initialTuition*repaymentAPR);
		    repaymentAPR = repaymentAPR + percentIncrease;
		}
		
		System.out.println("Total Tuition Cost = " + Double.toString(totalTuition));
		
	}
	
	public static double calculateMonthlyPayment() {
		double rate = 0;
		double Loan = 0;
		int NumPmt = 0;
		double percentageRate = rate/1200;
		double loanFormula = Math.pow(1+percentageRate, NumPmt);
		double MonthPMT = Loan*(percentageRate*loanFormula/(-1 + loanFormula));
		
	}
	
	

}


	
	
