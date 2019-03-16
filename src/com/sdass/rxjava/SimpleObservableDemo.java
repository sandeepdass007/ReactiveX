package com.sdass.rxjava;

import java.util.Arrays;
import java.util.List;

import rx.Observable;
import rx.schedulers.Schedulers;

public class SimpleObservableDemo {

	public static void main(String[] args) {
		basicObservableExample();
	}

	private static void basicObservableExample() {
		List<String> names = Arrays.asList("Sandeep", "Sunidhi", "Nayan");
		Observable<String> observableString = Observable.from(names);
		observableString.subscribe(new CustomObserver());
	}
}
