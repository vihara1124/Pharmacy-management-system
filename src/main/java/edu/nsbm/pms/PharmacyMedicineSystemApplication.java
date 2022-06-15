package edu.nsbm.pms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.nsbm.pms.entity.Medicine;
import edu.nsbm.pms.repository.MedicineRepository;

@SpringBootApplication
public class PharmacyMedicineSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PharmacyMedicineSystemApplication.class, args);
	}

	@Autowired
	private MedicineRepository medicineRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		//Medicine medicine1 = new Medicine("Losartan", "Medication used to treat high blood pressure", );
		//medicineRepository.save(medicine1);

		//Medicine medicine2 = new Medicine("Atenolol", "Medication primarily used to treat high blood pressure and heart-associated chest pain", "2100");
		//medicineRepository.save(medicine2);
		
	}

}
