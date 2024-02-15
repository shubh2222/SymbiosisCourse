package com.sym.stringbuff;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder st = new StringBuilder();
		st.append("Mumbai");
		st.append(false);
		st.append("-Pune");
		st.append("-Delhi");
		st.insert(7, true);
		System.out.println(st);
	}

}
