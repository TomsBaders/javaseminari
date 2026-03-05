package model.users;

import java.util.ArrayList;
import model.*;

public class BusinessUser extends User {
	ArrayList<Page> listOfPages;
	
	public BusinessUser (){}
	public BusinessUser (ArrayList<Page> a) {
		listOfPages = a;
	}
	
	public ArrayList<Page> getListOfPages() {
		return listOfPages;
	}
	
	public void setListOfPages(ArrayList<Page> listOfPages) {
		this.listOfPages = listOfPages;
	}
	
	public void createPage(Page a) {
		listOfPages.add(a);
	}
	
	@Override
	public String toString() {
		return "BusinessUser [listOfPages=" + listOfPages + "]";
	}
}
