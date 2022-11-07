package Model.Services;

import java.util.List;

import Model.People;

public class PeopleServices {
	
	public double filteredSumAge(List<People> people) {
		double sum = 0.0;
		for(People p: people) {
			if(p.getName().charAt(0) == 'T') {
				sum += p.getAge();
			}
		}
		return sum;
	}
}
