package edu.smith.cs.csc262.coopsh.apps;
import edu.smith.cs.csc262.coopsh.InputLine;
import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.Task;

public class Grep extends Task{
    
	int lineCount = 0;
	public Grep(ShellEnvironment env, String[] args) {
		super(env, args);
	}

	@Override
	protected void update() {
		InputLine line = this.input.poll();
		//String lookup = args[0];
		
		if (line == null) {
			return;
		}
		
		// only output and print when we've seen the whole file!
		if (line.isEndOfFile()) {
			    System.out.println(lineCount);
				this.closeOutput();
				this.exit(0);
				return;
			}
	   lineCount += 1;
	   System.out.println(line.get());

	    
		
	}

}
