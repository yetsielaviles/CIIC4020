package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		if (firstValueBoolean == false) {
			throw new IllegalStateException("nextValue: Invalid argument value = " +firstValueBoolean);}
		current = current * commonFactor; 
		return current;
	}
	@Override
	public String toString(){
		return "Geom(" + (int)super.firstValue() + ", " + (int)this.commonFactor + ")";
		
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		double value = this.firstValue()*Math.pow(commonFactor, n-1);
		return value; 
	}

	@Override
	public boolean Equals(Progression p) {
		if(p.toString().equals(this.toString()))
			return true;
		else
		return false;
	}
}
