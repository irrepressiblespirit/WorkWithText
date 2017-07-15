package com.viking.task2;

import java.util.Scanner;

public class Suggestion {

	public static void main(String[] args) {
		System.out.println("Please enter the text");
		Scanner scan=new Scanner(System.in);
		String text="";
		if(scan.hasNext()) {
			text=scan.nextLine();
		}
		//1
		System.out.println("Symbols in text: "+text.length());
		int countSymbols=0;
		//2
		String[] strArray=text.split(" ");
		for(int i=0;i<strArray.length;i++) {
			countSymbols+=strArray[i].length();
		}
		System.out.println("Symbols in text without spaces: "+countSymbols);
		//3
		System.out.println("Count of words in text: "+strArray.length);
		//4
		String[] suggestArr=text.split("\\.");
		System.out.println("Count of suggestions in text: "+suggestArr.length);
		for(int i=0;i<suggestArr.length;i++) {
			String[] words=suggestArr[i].split(" ");
			System.out.println("Count of words in text: "+words.length);
		}
		//5
		String[] words=text.split("\\.|\\s");
		int[] wordSize=new int[words.length];
		for(int j=0;j<wordSize.length;j++) {
			wordSize[j]=words[j].length();
		}
		int max=0;
		int index=0;
		for(int m=0;m<wordSize.length;m++) {
			if(wordSize[m]>max) {
				max=wordSize[m];
				index=m;
			}
		}
		System.out.println("The biggest word: "+words[index]);
		//6
		int min=10000;
		int ind=0;
		for(int m=0;m<wordSize.length;m++) {
			if(wordSize[m]<min) {
				min=wordSize[m];
				ind=m;
			}
		}
		System.out.println("The shorts word: "+words[ind]);
		//7
		boolean notPalindrome=true;
		for(int j=0;j<words.length;j++) {
			if((words[j].length()%2)!=0) {
				String tmp=words[j];
				int center=(Math.round((float)tmp.length()/2))-1;
				int pointer1=0;
				int pointer2=tmp.length()-1;
				while(pointer1!=center && pointer2!=center) {
					if(tmp.charAt(pointer1)!=tmp.charAt(pointer2)) {
						notPalindrome=false;
						break;
					}else {
						pointer1++;
						pointer2--;
					}
				}
				if(notPalindrome) {
					System.out.println("Palindrome is find: "+tmp);
				}else {
					notPalindrome=true;
				}
			}
		}
		scan.close();
	}

}
