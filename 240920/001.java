package yszl;

public class ngzs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
		int u=32;
		int v=26;
		while(v!=0) {
			int temp=u%v;
			u=v;
			v=temp;
		}
		System.out.println(u);

	}

}
/*
yszl
  JRE System Library
  src
    yszl
      ngzs.java
      	ngzs
       	   main(String[]):void
    module-info.java
      yszl
*/
