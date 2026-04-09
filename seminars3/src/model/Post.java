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
	
	public void setMsg(String inputmsg) {
		if (inputmsg != null || inputmsg != " ") {
			this.msg = inputmsg;
		}
	}
	public void setDate(LocalDateTime inputdate) {
		if (inputdate != null) {
			this.date = inputdate;
		}
	}
	public void setCountOfLikes(int inputcountOfLikes) {
		if (inputcountOfLikes < 0) {
			this.CountOfLikes = inputcountOfLikes;
		}
	}
	
	@Override
	public String toString() {
		return "Post [msg=" + msg + ", date=" + date + ", CountOfLikes=" + CountOfLikes +"]";
	}
}
