package com.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExampleFalse {
	public static void main(String args[]){
		StringTokenizer st = new StringTokenizer("I am an Tricon Employee"," ", false);
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
