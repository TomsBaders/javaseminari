package model;

import java.util.ArrayList;
import model.users.User;

public class Page {
	private String title;
	private String description;
	private ArrayList<User> followers;
	private ArrayList<Post> postsInPage;
	
	public Page(){}
	public Page(String a, String b, ArrayList<User> c, ArrayList<Post> d) {
		title = a;
		description = b;
		followers = c;
		postsInPage = d;
	}
	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public ArrayList<User> getFollowers() {
		return followers;
	}
	public ArrayList<Post> getPostsInPage() {
		return postsInPage;
	}
	
	public void setTitle(String inputtitle) {
		if (inputtitle != null || inputtitle != " ") {
			this.title = inputtitle;
		}
	}
	public void setDescription(String inputdescription) {
		if (inputdescription != null || inputdescription != " ") {
			this.description = inputdescription;
		}
	}
	public void setFollowers(ArrayList<User> inputfollowers) {
		if (inputfollowers != null) {
			this.followers = inputfollowers;
		}
	}
	public void setPostsInPage(ArrayList<Post> inputpostsInPage) {
		if (inputpostsInPage != null) {
			this.postsInPage = inputpostsInPage;
		}
	}
	
	@Override
	public String toString() {
		return "Page [title=" + title + ", description=" + description + ", followers=" + followers + ", postsInPage="
				+ postsInPage + "]";
	}
}
