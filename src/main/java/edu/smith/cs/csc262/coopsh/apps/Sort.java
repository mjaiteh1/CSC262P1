package edu.smith.cs.csc262.coopsh.apps;

//import edu.smith.cs.csc262.coopsh.InputLine;
import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.Task;

public class Sort extends Task {

	public Sort(ShellEnvironment env, String[] args) {
		super(env, args);
	}

	@Override
	protected void update() {
		
		// only output and print when we've seen the whole file!
		
				System.out.println(env.getVariable("ec"));
				this.closeOutput();
				this.exit(0);
				return;
	
		//System.out.println(line.get());
		
		

	}

}
