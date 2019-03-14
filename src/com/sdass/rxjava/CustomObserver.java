package com.sdass.rxjava;

import rx.Observer;

public class CustomObserver implements Observer<String> {

	@Override
	public void onCompleted() {
		System.out.println("Completed");
	}

	@Override
	public void onError(Throwable err) {
		System.err.println(err);
	}

	@Override
	public void onNext(String value) {
		System.out.println(value);
	}

}
