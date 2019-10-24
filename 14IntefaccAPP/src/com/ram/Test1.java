package com.ram;

public class Test1 {
	public static void main(String[] args)  throws Exception{
		EmployeeDao dao=new EmployeeDaoImpl();
		dao.saveEmp(12, "mohan", "7888.9f");
		dao.displayData(12, "mohan", "7888.9f");
	}

}
