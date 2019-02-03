package edu.smith.cs.csc262.coopsh.apps;

import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.Task;
import java.util.HashMap;
public class SetVar extends Task {

	public SetVar(ShellEnvironment env, String[] args) {
		super(env, args);
		if (args.length != 2) {
			System.err.println("setVar takes only two arguments");
		}
	}

	@Override
	protected void update() {
	   HashMap<String, String> var = new HashMap<String, String>();
	   var.put(args[0], args[1]);
	 
	   // print variables
	   System.out.println(var.get(args[0]));
	   this.closeOutput();
	   this.exit(0);
	}

}
