package application;

import java.util.ArrayList;
//this class list the tutors
public class UsersList {
	//creates the list
	private ArrayList<Users> users;
	private int userIndex;
	
		public UsersList() {
			this.users = new ArrayList<>();
			this.userIndex = 0;
		}
		//adds user-objects to the list
		public void addUser(Users user) {
			this.users.add(user);
		}
		//brings users from the list in order
		public Users getUser() {
			//int max = this.users.size() - 1;
			//int min = 0;
			//return this.users.get((int) (Math.random() * (max - min + 1) + min));
			if (this.userIndex < (this.users.size() - 1) ) {
				this.userIndex++;
				return this.users.get(this.userIndex);
			} else {
				this.userIndex = 0;
				return this.users.get(this.userIndex);
			}
		}
	}
