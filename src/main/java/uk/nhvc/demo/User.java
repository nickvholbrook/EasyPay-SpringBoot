package uk.nhvc.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="deposit")

public class User {

		@Id
		@GeneratedValues(strategy=GenerationType.IDENTITY)
		@Column(name="user_id")
		private Integer StudentId;
		
		@Column(name="User_name")
		private String name;
		
		@Column(name="Credit")
		private Integer DepositAmount;
		
		public void user(String user_id, String name) {
			this.name = name;
			this.user_id = user_id;
		}
		
}
