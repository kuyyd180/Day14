package dallhyun.submit10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class submit10 {

	public static void main(String[] args) {
		System.out.println("=========1번 문제========");
		HashSet<Integer> lotto = new HashSet<>();
		while (lotto.size() < 6) {
			lotto.add((int)(Math.random()* 45)+1);
		}
		List<Integer> lottoAlignment = new ArrayList<Integer>(lotto);
		Collections.sort(lottoAlignment);
		System.out.println(lottoAlignment);
		
		System.out.println("\n=========2번 문제========");
		
		HashMap<String, String> infoMap = new HashMap<>();

		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");
		
		while(true) {
			Scanner scid = new Scanner(System.in);
		  	System.out.println("아이디를 입력해주세요: "); 
		  	System.out.print(">>> "); 
		  	String id = scid.nextLine();
		  	
	     	if(infoMap.equals(id)) {
	     		Scanner scpw = new Scanner(System.in);
			  	System.out.println("비밀번호를 입력해주세요: "); 
			  	System.out.print(">>> "); 
			  	String pw = scpw.nextLine();
			  	
	     	}else  {
	     		System.out.println("존재하지 않는 아이디입니다.");
	     	}
	     		
		}
		
	} // main 끝
	
		
	
	
	
}
