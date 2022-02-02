package com.cjc.lamda;

public class LambdaEx {
	
	
	public static void main(String[] args) {
		
		System.out.println("lambda expression starts");
		System.out.println("first change master branch");
		
		
		//by creating implementation class
		MyInterface m1=new MyInterfaceImpl();
		m1.hello();
		
		//by creating anonymous class
		MyInterface m2=new MyInterface() {
			
			@Override
			public void hello() {
				System.out.println("anonymous-1 class saying hello");
				
			}
			
		
		};
		
		m2.hello();
		
		MyInterface m3=new MyInterface() {
			
			@Override
			public void hello() {
				System.out.println("anonymous-2 class saying hello");
				
			}
			
		
		};
		
		m3.hello();
		
		
		//without creating implementation class or using lambda expression
		
		
		MyInterface m4=()->{System.out.println("first time lamda saying hello ");};
		
		m4.hello();
		
		MyInterface m5=()->{System.out.println("second time lambda saying hello");};
		
		m5.hello();
		
		
		Addition addition=(x,y)->{return x+y;};
		
		System.out.println(addition.sum(20, 40));
		
		
		GetLength getLength=(str)->{return str.length();};
		
		System.out.println("length is = : "+getLength.etlenth("aniket"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		Addition ad=(a,b)->{return a+b;};
		
		int i=ad.sum(10, 20);
		
		System.out.println(i);
		
		
		
		
		
		
	}

}
