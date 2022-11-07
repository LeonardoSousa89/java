package Controller;

import java.util.function.Function;

import Model.People;

public class upperCaseName implements Function<People, String>{
	
	/*function*/
	@Override
	public String apply(People p) {
		return p.getName().toUpperCase();
	}
}
