package model.users;

import java.util.ArrayList;
import model.*;

public class PrivateUser extends User {
	private ArrayList<Post> privatePosts;
	private ArrayList<Post> publicPosts;
	private ArrayList<User> followers;
	
	public PrivateUser(){}
	public PrivateUser(ArrayList<Post> a, ArrayList<Post> b, ArrayList<Post> c) {
		
	}
	
	public ArrayList<Post> getPrivatePosts() {
		return privatePosts;
	}
	public ArrayList<Post> getPublicPosts() {
		return publicPosts;
	}
	public ArrayList<User> getFollowers() {
		return followers;
	}
	
	public void setPrivatePosts(ArrayList<Post> privatePosts) {
		this.privatePosts = privatePosts;
	}
	public void setPublicPosts(ArrayList<Post> publicPosts) {
		this.publicPosts = publicPosts;
	}
	public void setFollowers(ArrayList<User> followers) {
		this.followers = followers;
	}
	
	/*
	public String followPrivateUser() {
		
	}
	*/
	
	@Override
	public String toString() {
		return "PrivateUser [privatePosts=" + privatePosts + ", publicPosts=" + publicPosts + ", followers=" + followers
				+ "]";
	}
}
