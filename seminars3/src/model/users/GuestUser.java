package model.users;

public class GuestUser {
	private int generatedId;
	
	public GuestUser(){}

	public int getGeneratedId() {
		return generatedId;
	}
	
	public void setGeneratedId(int inputgeneratedId) {
		if (inputgeneratedId < 0) {
			this.generatedId = inputgeneratedId;
		}
	}

	@Override
	public String toString() {
		return "GuestUser [generatedId=" + generatedId + "]";
	}
}