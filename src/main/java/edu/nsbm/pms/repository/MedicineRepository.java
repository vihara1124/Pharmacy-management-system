package edu.nsbm.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import edu.nsbm.pms.entity.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long>, CrudRepository<Medicine, Long>{

}