package edu.smith.cs.csc262.coopsh.apps;

import edu.smith.cs.csc262.coopsh.Task;

import java.util.ArrayList;

import edu.smith.cs.csc262.coopsh.InputLine;
import edu.smith.cs.csc262.coopsh.ShellEnvironment;

public class Tail extends Task {

	ArrayList<String> sentences = new ArrayList<String>();
    int N = Integer.parseInt(args[0]);
	public Tail(ShellEnvironment env, String[] args) {
		super(env, args);
	}

	@Override
	protected void update() {
		InputLine line = this.input.poll();
		if (line.isEndOfFile()) {
		   int size = sentences.size() - N;
			for (int i = size; i < sentences.size(); i++)  {
				this.println(sentences.get(i));
			}
			this.closeOutput();
			this.exit(0);
			return;
		}
		sentences.add(line.get());
	}

}
