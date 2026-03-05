package model;

import java.time.LocalDateTime;

public class Post {
	private String msg;
	private LocalDateTime date;
	private int CountOfLikes;
	
	public Post(){}
	public Post(String a, int c) {
		msg = a;
		date = LocalDateTime.now();
		CountOfLikes = c;
	}
	
	public String getMsg() {
		return msg;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public int getCountOfLikes() {
		return CountOfLikes;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public void setCountOfLikes(int countOfLikes) {
		this.CountOfLikes = countOfLikes;
	}
	
	@Override
	public String toString() {
		return "Post [msg=" + msg + ", date=" + date + ", CountOfLikes=" + CountOfLikes +"]";
	}
}
