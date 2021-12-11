package com.app.funtions;

import java.util.function.Function;

public class FindStringLenth {

	public static void main(String[] args) {
		 Function<String, Integer> f=s->s.length();
		 System.out.println(f.apply("kulasekharthurlu@gmail.com"));

	}

}
