package edu.smith.cs.csc262.coopsh.apps;

import edu.smith.cs.csc262.coopsh.InputLine;
import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.Task;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RGrep extends Task{
	
	String pattern = args[0];
	public RGrep(ShellEnvironment env, String[] args) {
		super(env, args);

	}
	@Override
	protected void update() {
		InputLine line = this.input.poll();
	
		if (line == null) {
			return;
		}
		// only output and print when we've seen the whole file!
		if (line.isEndOfFile()) {
			
				this.closeOutput();
				this.exit(0);
				return;
		}
		
		//create a pattern object 
		Pattern r = Pattern.compile(pattern);
		
		// create a matcher object
		Matcher m = r.matcher(line.get());
		
		if (m.find() ) {
			this.println(line.get());
		}
		
	}

}
