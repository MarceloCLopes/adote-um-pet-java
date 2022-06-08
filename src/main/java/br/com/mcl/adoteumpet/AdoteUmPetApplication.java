package br.com.mcl.adoteumpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mcl.adoteumpet.core.models.Pet;
import br.com.mcl.adoteumpet.core.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner {

	@Autowired
	private PetRepository petRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setName("Gon");
		pet.setHistory("Amigo");
		pet.setPhoto(
				"https://www.purina.com/sites/g/files/auxxlc196/files/styles/large/public/10-facts-about-cats_500x300.jpg?itok=UqUmK3v5");
		petRepository.save(pet);

	}

}
