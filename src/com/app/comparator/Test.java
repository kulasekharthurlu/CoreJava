package com.app.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<User> list=new ArrayList<User>();
		list.add(new User(123,"kula","kula@email.com"));
		list.add(new User(12323,"kulasekhar","ali@email.com"));
		list.add(new User(12311,"lalu","lalu@email.com"));
		list.add(new User(15523,"kaka","kulkmsdn@email.com"));
		Collections.sort(list, (e1,e2)->e1.getId()-e2.getId());
	//	Collections.sort(list, (e1,e2)->e2.getEmail().compareTo(e1.getEmail()));
		for(User u:list) {
			System.out.println(u);
		}
	}
	
}
