package com.joe.qiao.domain.headfirst.observer.Weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
