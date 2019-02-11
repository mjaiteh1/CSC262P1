package edu.smith.cs.csc262.coopsh.apps;

import edu.smith.cs.csc262.coopsh.InputLine;
import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.Task;
import java.util.ArrayList; 
import java.util.Collections;

public class Sort extends Task {

	ArrayList<String> sentences = new ArrayList<String>();
	public Sort(ShellEnvironment env, String[] args) {
		super(env, args);

	}

	@Override
	protected void update() {
		InputLine line = this.input.poll();

		if (line == null) {
			return;
		}
		if (line.isEndOfFile()) {
			Collections.sort(sentences);
			for (int i =0; i < sentences.size();i++) {
				this.println(sentences.get(i));
			}
			
			this.closeOutput();
			this.exit(0);
			return;
	}
		sentences.add(line.get());
		
		
	}
	 
}


