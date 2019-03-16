package com.sdass.rxjava;

import java.util.Arrays;
import java.util.List;

import rx.Observable;
import rx.schedulers.Schedulers;

public class SimpleObservableDemo {

	public static void main(String[] args) {
		basicObservableExample();
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

	private static void basicObservableExample() {
		List<String> names = Arrays.asList("Sandeep", "Sunidhi", "Nayan");
		Observable<String> observableString = Observable.from(names);
		observableString.subscribe(new CustomObserver());
	}
}
