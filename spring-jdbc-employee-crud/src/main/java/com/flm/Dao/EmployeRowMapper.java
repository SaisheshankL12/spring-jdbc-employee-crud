package com.flm.Dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.flm.model.Employe;
public class EmployeRowMapper implements RowMapper<Employe> {
	@Override
	public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employe emp = new Employe();
		emp.setId(rs.getLong("id"));
		emp.setName(rs.getString("name"));
		emp.setSalary(rs.getDouble("salary"));
		emp.setBanch(rs.getLong("branch"));
		return emp;
	}

}
