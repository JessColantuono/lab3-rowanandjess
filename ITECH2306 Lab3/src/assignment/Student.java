package assignment;

/**
 * @author 30333241
 * @version 1.0
 * @created 10-Apr-2018 12:38:54 PM
 */
public class Student extends Person {

	/**
	 * @return the invoice
	 */
	private double getInvoice() {
		return invoice;
	}

	/**
	 * @param invoice the invoice to set
	 */
	private void setInvoice(double invoice) {
		this.invoice = invoice;
	}

	/**
	 * @return the results
	 */
	private double getResults() {
		return results;
	}

	/**
	 * @param results the results to set
	 */
	private void setResults(double results) {
		this.results = results;
	}

	/**
	 * @return the studentNumber
	 */
	private int getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber the studentNumber to set
	 */
	private void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	private double invoice;
	private double results;
	private int studentNumber;

	public Student(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Student