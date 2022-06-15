package edu.nsbm.pms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.nsbm.pms.entity.Medicine;
import edu.nsbm.pms.service.MedicineService;
import edu.nsbm.pms.repository.MedicineRepository;

@Service

public class MedicineServiceImpl implements MedicineService{
	
	private MedicineRepository medicineRepository;
	
	public MedicineServiceImpl(MedicineRepository medicineRepository) {
		super();
		this.medicineRepository = medicineRepository;
	}

	@Override
	public List<Medicine> getAllMedicine() {
		return medicineRepository.findAll();
	}

	@Override
	public Medicine saveMedicine(Medicine medicine) {
		return medicineRepository.save(medicine);
		
	}

	@Override
	public Medicine getMedicineById(Long idno) {
		return medicineRepository.findById(idno).get();
	}

	@Override
	public Medicine updateMedicine(Medicine medicine) {
		return medicineRepository.save(medicine);
	}

	@Override
	public void deleteMedicineById(Long idno) {
		medicineRepository.deleteById(idno);
		
	}

}
