package edu.smith.cs.csc262.coopsh.apps;

import edu.smith.cs.csc262.coopsh.InputLine;
import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.Task;
import java.util.ArrayList;

public class Head extends Task {
    
    ArrayList<String> sentences = new ArrayList<String>();
    int N = Integer.parseInt(args[0]);

	public Head(ShellEnvironment env, String[] args) {
		super(env, args);
	}

	@Override
	protected void update() {
		InputLine line = this.input.poll();
		if (line.isEndOfFile()) {
			for (int i = 0; i < N; i++)  {
				this.println(sentences.get(i));
			}
			this.closeOutput();
			this.exit(0);
			return;
	}
		
		sentences.add(line.get());
	}

}
