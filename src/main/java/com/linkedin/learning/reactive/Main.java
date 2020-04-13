package com.linkedin.learning.reactive;

import java.util.Arrays;

import com.linkedin.learning.reactive.observer.ConsolePrintObserver;

import io.reactivex.Flowable;
import io.reactivex.Observable;

public class Main {

	public static void main(String[] args) {
        createFromArray(new Object[] {"Sandeep", "Komal", "Amandeep", "Neetika", "Neha", "Jatinder"});
        createFromOneElement();
        filterDataExample();
        useCustomObserver();
    }

	private static void useCustomObserver() {
		Observable<Integer> observable = Observable.fromIterable(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10}));
		observable.subscribe(new ConsolePrintObserver());
	}

	private static void filterDataExample() {
		Observable<Integer> observable = Observable.fromIterable(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10}));
		observable.filter(integer -> integer % 2 == 0).subscribe(System.out::println);
		observable.map(integer -> Math.multiplyExact(integer, integer)).subscribe(System.out::println);
	}

	private static void createFromOneElement() {
		System.out.println("Creating stream of one element");
		Flowable.just("Hello world").subscribe(System.out::println);
	}
	
	private static void createFromArray(Object...objects) {
		System.out.println("Creating stream of multiple element");
		Flowable.fromArray(objects).subscribe(System.out::println);
	}
}
