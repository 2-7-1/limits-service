package com.rest.microservices.limitsservice.bean;

public class LimitConfiguration {
	
	private Integer maximum;
	private Integer minimum;
	
	public Integer getMaximum() {
		return maximum;
	}
	
	public Integer getMinimum() {
		return minimum;
	}

	protected LimitConfiguration() {
		super();
	}

	public LimitConfiguration(Integer maximum, Integer minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
}
