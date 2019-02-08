package edu.smith.cs.csc262.coopsh.apps;

import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.Task;

public class Echo extends Task {
	
	
	public Echo(ShellEnvironment env, String[] args) {
		super(env, args);	
	}
	
	@Override
	protected void update() {
		
		this.println(args[0]);
		this.closeOutput();
		this.exit(0);
	}

	

}
