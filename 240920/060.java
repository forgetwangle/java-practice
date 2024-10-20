package notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Coin {	
	private HashMap<Integer, String> coinnames=new HashMap<Integer,String>();
	
	public Coin() {
		coinnames.put(1, "penny");
		coinnames.put(5, "nickel");
		coinnames.put(10, "dime");
		coinnames.put(10, "一分");//集合中后一项相同key的值覆盖了前一项
		coinnames.put(25, "quarter");
		System.out.println(coinnames.keySet().size());
		System.out.println(coinnames);
		for(Integer k:coinnames.keySet()) {
			String s=coinnames.get(k);
			System.out.println(s);
		}
	}
	
	public String getName(int amount) {
		if(coinnames.containsKey(amount)) {
			return coinnames.get(amount);
		}else
			return "NOT FOUND";
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		Coin coin=new Coin();
		String name=coin.getName(amount);
		System.out.println(name);
		
	}

}

/**
 * 1 penny
 * 5 nickel
 * 10 dime
 * 25 quarter
 * 50 half-dollar
 * 
 * HashMap哈希表，放入其中的所有东西包含key和value
 * 	容器内的所有类型必须是对象
 */

