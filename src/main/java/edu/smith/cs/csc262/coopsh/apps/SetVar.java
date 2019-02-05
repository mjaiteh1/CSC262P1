package edu.smith.cs.csc262.coopsh.apps;

import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.Task;
public class SetVar extends Task {

	public SetVar(ShellEnvironment env, String[] args) {
		super(env, args);
		if (args.length != 2) {
			System.err.println("setVar takes only two arguments");
		}
	}

	@Override
	protected void update() {
	   
	   env.setVariable(args[0],  args[1]);
	 
	   // print variables
	   this.closeOutput();
	   this.exit(0);
	}

}
