package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		if (this.firstValue() < 0) {
			throw new IllegalStateException("nextValue: Invalid argument value = " + current);}
		current = current * commonFactor; 
		return current;
	}
	@Override
	public String toString(){
		return "Geom(3,2)";
		
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		double value = this.firstValue()*Math.pow(commonFactor, n-1);
		return value; 
	}
}
