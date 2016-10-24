package apartment;

import com.lemanov.house.Owner;

public class LivingApartment extends Apartment {
	
	private Owner[] owners;
	
	public LivingApartment(int number, int capacity) {
		super(number);
		this.owners = new Owner[capacity];
	}
	
	public void addOwner(Owner owner) {
		owners[getFreeRoomIndex()] = owner;
	}

	public int getFreeRoomIndex() {
		for (int i=0; i<owners.length; i++) {
			if (owners[i] == null) {
				return i;
			}
		}
		throw new RuntimeException("No free rooms for owner!");
	}

	@Override
	public String toString() {
		String res = super.toString();
		for (Owner owner : owners) {
			if (owner != null) {
//				res += "****************\n";
				res += "Owner: " + owner.toString() + "\n";
//				res += "****************\n";
			}
		}
		return res;
	}

	@Override
	public boolean isFree() {
		return owners[owners.length - 1] == null;
	}
	
	public boolean isSettled() {
		return (owners[0] != null);
	}

}
