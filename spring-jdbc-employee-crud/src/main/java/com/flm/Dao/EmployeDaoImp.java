package com.flm.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.flm.model.Employe;

public class EmployeDaoImp implements EmployeDao {
	private String insert = "insert into employe(name, salary, branch) values(?,?,?)";
	private String update = "update employe set name=?, salary=?, branch=? where id=?";
	private String delete = "delete from employe where id=?";
	private String AllEmp = "select * from employe";
	private String OneEmp = "select * from employe where id=?";
	private String searchEmp = "select * from employe where name like ?";
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplet(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void saveEmploye(Employe emp) {
		jdbcTemplate.update(insert, emp.getName(), emp.getSalary(), emp.getBanch());
	}
	@Override
	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	public void updateEmploye(Employe emp) {
		jdbcTemplate.update(update, emp.getName(), emp.getSalary(), emp.getBanch(), emp.getId());
		
	}
	@Override
	public void deleteEmploye(Long id) {
		
		jdbcTemplate.update(delete, id);
	}
	@Override
	public List<Employe> getAllEmplot() {
		List<Employe> emp = jdbcTemplate.query(AllEmp, new EmployeRowMapper());
		return emp;
	}
	@Override
	public Employe getOneEmploy(Long id) {	
		List<Employe> emp = jdbcTemplate.query(OneEmp, new EmployeRowMapper(), id);
		return emp.get(0);
	}
	@Override 
	public List<Employe> getAllEmplot(String name) {
		List<Employe> emp = jdbcTemplate.query(searchEmp, new EmployeRowMapper(), name);
		return emp;
	}
	
	
	
	
	
}
