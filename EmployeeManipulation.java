package com.junit.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeManipulation {
	
	List<EmployeEntity> sortByNum(){
		List<EmployeEntity> list=new ArrayList<>();
		list.add(new EmployeEntity("Balakrishna", 1234));
		list.add(new EmployeEntity("Mounica", 12345));
		list.add(new EmployeEntity("Gowtham", 8393));
		list.add(new EmployeEntity("Nethra", 912));
		
		Comparator<EmployeEntity> c=(e1,e2)->(e1.getEmpNum()>e2.getEmpNum())?1:(e1.getEmpNum()<e2.getEmpNum())?-1:0;
		
		
		Collections.sort(list,c);
		System.out.println(list);
		
		return list;
		
	}
	List<EmployeEntity> sortByName(){
		List<EmployeEntity> list=new ArrayList<>();
		list.add(new EmployeEntity("Balakrishna", 1234));
		list.add(new EmployeEntity("Mounica", 12345));
		list.add(new EmployeEntity("Gowtham", 8393));
		list.add(new EmployeEntity("Nethra", 912));
		Comparator<EmployeEntity> c=(e1,e2)->(e1.getEmpName().compareTo(e2.getEmpName()));
		Collections.sort(list,c);
		System.out.println(list);
		return list;
		
	}
	public static void main(String[] args) {
		EmployeeManipulation emp=new EmployeeManipulation();
		emp.sortByNum();
		emp.sortByName();
	}

}
