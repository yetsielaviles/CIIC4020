package orderedStructures;

import interfaces.Combinable;

public class Arithmetic extends Progression implements Combinable{
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		if (firstValueBoolean == false) {
			throw new IllegalStateException("nextValue: Invalid argument value = " +firstValueBoolean);}
		current = current + commonDifference; 
		return current;
	}
	
	@Override
	public String toString(){
		return "Arith(" +(int)super.firstValue()+ ", " +(int)this.commonDifference+ ")";
		
	}
	
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		double value = commonDifference*(n-1) + this.firstValue();
		return value; 
	}

	@Override
	public boolean Equals(Progression p) {
		if(p.toString().equals(this.toString()))
			return true;
		else
		return false;
	}

	@Override
	public Progression add(Arithmetic p) {
		Progression result = new Arithmetic( this.firstValue()+p.firstValue(), this.commonDifference+p.commonDifference);
		return result;
	}

	@Override
	public Progression substract(Arithmetic p) {
		Progression result = new Arithmetic( this.firstValue()-p.firstValue(), this.commonDifference-p.commonDifference);
		return result;
	}

}
