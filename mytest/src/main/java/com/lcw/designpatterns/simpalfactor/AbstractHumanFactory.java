package com.lcw.designpatterns.simpalfactor;

public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T> c);
}
