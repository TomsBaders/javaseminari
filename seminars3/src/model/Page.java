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
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setFollowers(ArrayList<User> followers) {
		this.followers = followers;
	}
	public void setPostsInPage(ArrayList<Post> postsInPage) {
		this.postsInPage = postsInPage;
	}
	
	@Override
	public String toString() {
		return "Page [title=" + title + ", description=" + description + ", followers=" + followers + ", postsInPage="
				+ postsInPage + "]";
	}
}
