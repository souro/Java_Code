package com.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExampleStr {
	public static void main(String args[]){
		StringTokenizer st = new StringTokenizer("I am an Tricon Employee");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken(" "));
		}
	}
}
