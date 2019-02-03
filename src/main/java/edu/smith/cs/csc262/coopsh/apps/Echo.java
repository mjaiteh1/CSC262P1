package edu.smith.cs.csc262.coopsh.apps;

import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.Task;

public class Echo extends Task {

	public Echo(ShellEnvironment env, String[] args) {
		super(env, args);
	 
			//System.out.println(args);
			
	}

	@Override
	protected void update() {
		for (int i = 0; i < args.length; i++) { 
			System.out.print(args[i] + " ");
		}
		System.out.println();
		this.closeOutput();
		this.exit(0);
	}

}
