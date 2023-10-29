package pojos;

public enum Course {
	 DAC(60000),DITISS(50000),DBDA(10000);
	private double fees;
	
	private Course(double fees) {
		this.fees=fees;
		
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	

}
