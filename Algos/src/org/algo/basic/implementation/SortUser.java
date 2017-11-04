package org.algo.basic.implementation;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;


class User {
	String name;
	String emailId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public static Comparator<User> nameComparator = new Comparator<User>() {

		@Override
		public int compare(User o1, User o2) {
			String user1 = o1.getName().toUpperCase();
			String user2 = o2.getName().toUpperCase();
			
			
			return user1.compareTo(user2);
		}
	};
	
	public static Comparator<User> emailComparator = new Comparator<User>() {

		@Override
		public int compare(User o1, User o2) {
			String user1 = o1.getEmailId().toUpperCase();
			String user2 = o2.getEmailId().toUpperCase();
			
			
			return user1.compareTo(user2);
		}
	};
	
	
}




public class SortUser {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        User[] users = new User[N];
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            User user = new User();
            user.setName(firstName);
            user.setEmailId(emailID);
            users[a0] = user;
        }
		
		Arrays.sort(users, User.nameComparator);
		Arrays.sort(users, User.emailComparator);

		for (int i = 0; i < users.length; i++) {
			System.out.println(users[i].getName());
		}
	}

}
