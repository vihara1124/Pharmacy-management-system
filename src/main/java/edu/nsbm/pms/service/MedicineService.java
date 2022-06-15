package edu.nsbm.pms.service;
import java.util.List;
import edu.nsbm.pms.entity.Medicine;

public interface MedicineService {
	
List<Medicine> getAllMedicine();
	
Medicine saveMedicine(Medicine medicine);
	
Medicine getMedicineById(Long idno);
	
Medicine updateMedicine(Medicine medicine);
	
	void deleteMedicineById(Long idno);

}
