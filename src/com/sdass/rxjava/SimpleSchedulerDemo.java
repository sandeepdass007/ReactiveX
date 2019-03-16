package com.sdass.rxjava;

import rx.Observable;
import rx.schedulers.Schedulers;

public class SimpleSchedulerDemo {
	public static void main(String args[]) {
		basicSchedulerExample();
	}
	
	private static void basicSchedulerExample() {
		Observable.range(1, 10)
			.map(value -> value * 2)
			.observeOn(Schedulers.computation())
			.subscribe(System.out::println);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
