package com.example.windenglish.mgr;

import com.example.windenglish.struct.UserProfile;

public class AccountMgr {

	private static UserProfile user = null;

	public static UserProfile getUserProfile() {
		if (user == null) {
			user = new UserProfile();
			user.setUserName("Jack");
			user.setName("SJ");
			user.setEmail("sss@sss");
		}
		return user;
	}
}
