package com.sdass.rxjava;

import java.util.Arrays;
import java.util.List;

import rx.Observable;

public class SimpleObservableDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sandeep", "Sunidhi", "Nayan");
		Observable<String> observableString = Observable.from(names);
		observableString.subscribe(new CustomObserver());
	}

}
