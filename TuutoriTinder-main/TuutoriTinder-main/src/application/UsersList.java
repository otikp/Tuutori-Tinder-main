package application;

import java.util.ArrayList;

public class UsersList {
	
	private ArrayList<Users> users;
	
		public UsersList() {
			this.users = new ArrayList<>();
		}
		
		public void addUser(Users user) {
			this.users.add(user);
		}
		
		public Users getUser() {
			int max = this.users.size() - 1;
			int min = 0;
			return this.users.get((int) (Math.random() * (max - min + 1) + min));
		}
	}
