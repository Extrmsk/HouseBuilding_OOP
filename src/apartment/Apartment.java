package apartment;

public abstract class Apartment {
	
	private int number;
	
	public Apartment(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " number " + number + "\n";
	}

	public boolean isFree() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getNubmer() {
		return Integer.toString(number);
	}

}
