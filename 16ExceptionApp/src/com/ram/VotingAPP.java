package com.ram;

public class VotingAPP {

	void vote(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("Age is less than 18 . Vote not allowed");
		} else {
			System.out.println("Voted Sucessfully");
		}
	}

	public static void main(String[] args) {
		VotingAPP va = new VotingAPP();
		try {
			va.vote(17);
		} catch (VotingException e) {
			System.out.println(e.getMessage());
		}
	}

}
