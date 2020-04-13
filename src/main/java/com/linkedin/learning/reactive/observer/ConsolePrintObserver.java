package com.linkedin.learning.reactive.observer;

import io.reactivex.observers.DefaultObserver;

public class ConsolePrintObserver extends DefaultObserver<Object> {

	@Override
	public void onNext(Object object) {
		System.out.println(String.format("[%s]", object));
	}

	@Override
	public void onError(Throwable e) {
		System.out.println(e.getMessage());
	}

	@Override
	public void onComplete() {
		System.out.println("Observables completed....");
	}

}
