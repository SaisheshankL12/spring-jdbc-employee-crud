package com.flm.Dao;

import java.util.List;

import com.flm.model.Employe;

public interface EmployeDao {
	void saveEmploye(Employe emp);
	void updateEmploye(Employe emp);
	void deleteEmploye(Long id);
	Employe getOneEmploy(Long id);
	List<Employe> getAllEmplot();
	List<Employe> getAllEmplot(String name);
}
