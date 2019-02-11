package edu.smith.cs.csc262.coopsh.apps;

import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.Task;

public class Echo extends Task {
	
	
	public Echo(ShellEnvironment env, String[] args) {
		super(env, args);	
	}
	
	@Override
	protected void update() {
		String[] lines = args[0].split("\n");
		for (int i = 0; i < lines.length; i++) {
			this.println(lines[i]);	
		}
		this.closeOutput();
		this.exit(0);
	}

	

}
