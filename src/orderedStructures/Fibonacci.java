package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
        // add the necessary code here
		double temp = prev;
		prev = current;
		current += temp;
		
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}
	
	@Override
	public String toString(){
		return "Fibon(" +(int)super.firstValue()+ ")";
	}
	
	@Override
	public boolean Equals(Progression p) {
		if(p.toString().equals(this.toString()))
			return true;
		else
		return false;
	}

}
