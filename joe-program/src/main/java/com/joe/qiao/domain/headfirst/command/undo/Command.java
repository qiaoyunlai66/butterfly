package com.joe.qiao.domain.headfirst.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
