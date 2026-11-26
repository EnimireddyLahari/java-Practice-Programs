package com.polymorphism;

public class MovieTicketMain {

	public static void main(String[] args) {
		MovieTicket mt=new MovieTicket();
		mt.bookTicket(5);
		mt.bookTicket(5,false);
		mt.bookTicket(5,true,20.0);
		

	}

}
