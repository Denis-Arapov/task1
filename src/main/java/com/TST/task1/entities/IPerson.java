package com.TST.task1.entities;
import com.TST.task1.entities.enums.Gender;
import java.math.BigDecimal;
import java.time.LocalDate;


public interface IPerson {
	
	public Integer getId();
	
	public void setId(Integer id);
	
	public String getFirstName();
	
	public void setFirstName(String firstName);
	
	public String getLastName();
	
	public void setLastName(String firstName);
	
	public LocalDate getBirthdate();
	
	public void setBirthdate(LocalDate birthdate);
	
	public Integer getAge();
	
	public Gender getGender();
	
	public void setGender(Gender gender);
	
	public IDivision getDivision();
	
	public void setDivision(IDivision division);
	
	public BigDecimal getSalary();
	
	public void setSalary(BigDecimal salary);
	
	

}
