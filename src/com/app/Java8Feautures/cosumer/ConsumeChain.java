package com.app.Java8Feautures.cosumer;

import java.util.function.Consumer;

public class ConsumeChain {

	public static void main(String[] args) {
		Movie m=new Movie("Spider");
		Consumer<Movie> c1=g->System.out.println( g.name+"Ready to realeased");
		Consumer<Movie> c2=g->System.out.println( g.name+" but big flap the movie");
		Consumer<Movie> c3=g->System.out.println( g.name+" store the data in database");
		Consumer<Movie> cc=	 c1.andThen(c2).andThen(c3);
		cc.accept(m);

	}

}
class Movie{
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}

}
