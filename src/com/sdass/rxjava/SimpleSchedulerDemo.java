package com.sdass.rxjava;

import rx.Observable;
import rx.schedulers.Schedulers;

public class SimpleSchedulerDemo {
	public static void main(String args[]) {
		basicSchedulerExample();
	}
	
	private static void basicSchedulerExample() {
		Observable.range(0, 10)
			.map(value -> value / (value - 1))
			.onErrorReturn(error -> {
				System.out.println("Error Occured: " +  error.getMessage());
				return -1;
			})
			.observeOn(Schedulers.computation())
			.subscribe(System.out::println);
		try {
			// Main Thread needs to wait
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
