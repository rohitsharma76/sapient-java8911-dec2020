package com.sapient.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer> {
	@Override
	public void accept(Integer t) {
		System.out.println("Value : " + t);
	}
}

public class LambdaEx07 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(324,5,3,2,1,44,66);
		

		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		
		System.out.println("--- printing with custom customer --------");
		
		MyConsumer mc = new MyConsumer(); 
		list.forEach(mc);
	}
}
