package com.spcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyCollections {
	private List<String> nameList;
	private Set<Integer> regId;
	private Map<String, String> address;
	private Properties myProps;
	public List<String> getNameList() {
		System.out.println("List Elements are "+nameList);
		return nameList;
	}
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
	public Set<Integer> getRegId() {
		System.out.println("Set Elements are "+regId);
		return regId;
	}
	public void setRegId(Set<Integer> regId) {
		this.regId = regId;
	}
	public Map<String, String> getAddress() {
		System.out.println("Map Elements are "+address);
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	public Properties getMyProps() {
		System.out.println("Properties Elements are "+myProps);
		return myProps;
	}
	public void setMyProps(Properties myProps) {
		this.myProps = myProps;
	}	
}
