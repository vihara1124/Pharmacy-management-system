package edu.nsbm.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import edu.nsbm.pms.entity.Medicine;
import edu.nsbm.pms.service.MedicineService;

@Controller
public class MedicineController {

	private MedicineService medicineService;

	public MedicineController(MedicineService medicineService) {
		super();
		this.medicineService = medicineService;
	}

	//handler method to handle list medicine and return mode and view
	@GetMapping("/medicine")
	public String listMedicine(Model model) {
		model.addAttribute("medicine", medicineService.getAllMedicine());
		return "medicine";
	}	
	
	@GetMapping("/medicine/new")
	public String createMedicineForm(Model model) {
		
		//create medicine object to hold medicine form data
		Medicine medicine = new Medicine();
		model.addAttribute("medicine", medicine);
		return "create_medicine";
	}
	
	@PostMapping("/medicine")
	public String saveMedicine(@ModelAttribute("medicine") Medicine medicine) {
		medicineService.saveMedicine(medicine);
		return "redirect:/medicine";
	}
	
	@GetMapping("/medicine/edit/{idno}")
	public String editMedicineForm(@PathVariable Long idno, Model model) {
		model.addAttribute("medicine", medicineService.getMedicineById(idno));
		return "edit_medicine";
	}
	
	@PostMapping("/medicine/{idno}")
	public String updateMedicine(@PathVariable Long idno,
			@ModelAttribute("medicine") Medicine medicine,
			Model model) {
		
		//get medicine from database by id
		Medicine existingMedicine = medicineService.getMedicineById(idno);
		existingMedicine.setIdNo(idno);
		existingMedicine.setMedicineName(medicine.getMedicineName());
		existingMedicine.setMedicineDescription(medicine.getMedicineDescription());
		existingMedicine.setAmount(medicine.getAmount());
		
		//save updated medicine object
		medicineService.updateMedicine(existingMedicine);
		return "redirect:/medicine";
	}
	
	//handler method to handle delete medicine request
	@GetMapping("/medicine/{idno}")
	public String deleteMedicine(@PathVariable Long idno) {
		medicineService.deleteMedicineById(idno);
		return "redirect:/medicine";
	}
	
}
