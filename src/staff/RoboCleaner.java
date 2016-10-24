package staff;

import apartment.Apartment;

public class RoboCleaner implements Cleaner {
	
	private String nick;

	public RoboCleaner(String nick) {
		this.nick = nick;
	}

	@Override
	public void clean(Apartment apartment) {
		System.out.println("Robot " + nick + " cleaning is done!");
	}

}
