package Framework.Utils;

import java.util.Locale;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class FakersGeneration {
	
	
	private Faker faker;
	private String email;
	private String name;
	private String password;
	
	public FakersGeneration() {
		
		faker = new Faker(new Locale("pt-BR"));
		
	}
	
	public String getEmail() {
		
		email = faker.internet().emailAddress();
		return email;
	}

	public String getName() {
		
	name = faker.name().fullName();
		return name;
	}
	
	public String getPassword() {
		
		password = faker.animal().name();
		return password;
	}
	
	
}
