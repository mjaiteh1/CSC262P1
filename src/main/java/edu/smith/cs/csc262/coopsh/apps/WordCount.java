package edu.smith.cs.csc262.coopsh.apps;

import edu.smith.cs.csc262.coopsh.InputLine;
import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.Task;

public class WordCount extends Task {
	int wordCount = 0;
    int lineCount = 0;
    int byteCount = 0;
	public WordCount(ShellEnvironment env, String[] args) {
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
			this.println(lineCount);
            this.println(byteCount);
			this.println(wordCount);
			this.closeOutput();
			this.exit(0);
			return;
		}
		
		// Otherwise, increment this count!
		wordCount += line.get().split("\\s+").length;	
		lineCount += 1;
		byteCount += line.get().getBytes().length;

	}
	
}
