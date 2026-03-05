package model.users;

public class GuestUser {
	private int generatedId;
	
	public GuestUser(){}

	public int getGeneratedId() {
		return generatedId;
	}
	
	public void setGeneratedId(int generatedId) {
		this.generatedId = generatedId;
	}

	@Override
	public String toString() {
		return "GuestUser [generatedId=" + generatedId + "]";
	}
}
