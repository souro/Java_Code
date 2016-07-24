package com.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExampleMultipleDeli {
	public static void main(String args[]){
		StringTokenizer st = new StringTokenizer("I am a/n Tri#/con Employee", " ,/,#");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
