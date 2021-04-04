package com.junit.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateTest {
	
	/**
	 * This method is to return a list with name length <=5 
	 * used Predicate and Collect and collectors also comparator 
	 * 
	 * @return
	 */
	List<String> getStringListByLength5(){
		List<String> list=new ArrayList<>();
		list.add("Balakrishna");
		list.add("Mounica");
		list.add("Gowtham");
		list.add("Nethra");
		list.add("Bala");
		list.add("Mouni");
		list.add("Gowth");
		Predicate<String> p=e->e.length()<=5;
		List<String> resultList=list.stream().filter(p).collect(Collectors.toList());
		Comparator<String> c=(e1,e2)->(e1.compareTo(e2));
		Collections.sort(resultList,c);
		System.out.println("result list::"+resultList);
		return resultList;
		
		
	}
	
	
	public static void main(String[] args) {

		Predicate<Integer> p=(i)->(i%2==0);
		System.out.println("result:::"+p.test(7));
	PredicateTest pt=new PredicateTest();
	pt.getStringListByLength5();
	}

}
