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
	
	public void setListOfPages(ArrayList<Page> inputlistOfPages) {
		if (inputlistOfPages != null) {
			this.listOfPages = inputlistOfPages;
		}
	}
	
	public void createPage(Page a) {
		if (a != null) {
			listOfPages.add(a);
		}
	}
	
	@Override
	public String toString() {
		return "BusinessUser [listOfPages=" + listOfPages + "]";
	}
}
