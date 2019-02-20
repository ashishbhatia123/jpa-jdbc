package com.cg.ems.ui;

import java.util.ArrayList;

import com.cg.ems.dto.Employee;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;

public class TestEmpJpaDemo {

	public static void main(String[] args) {
		EmployeeService empSer=new EmployeeServiceImpl();
		Employee e1=new Employee();
		e1.setEmpName("aaa");
		e1.setEmpSal(8000.0F);
		
		Employee ee1=empSer.addEmp(e1);
	
		System.out.println(ee1+"and are inserted");
		ArrayList<Employee> eList=empSer.fetchAllEmp();
		for(Employee tempE:eList)
		{
			System.out.println(tempE.getEmpId()+" "+tempE.getEmpName()+""+tempE.getEmpSal());
		}
		Employee updatedE=empSer.updateEmp(62, "Kaushal",50000);
		System.out.println(updatedE.getEmpId());

	}

}
