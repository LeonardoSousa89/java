package Controller;

import java.util.function.Consumer;

import Model.People;

public class ageAdvance implements Consumer<People>{
	/*consumer*/
	@Override
	public void accept(People a) {
		a.setAge(a.getAge() + 10);
	}
}
