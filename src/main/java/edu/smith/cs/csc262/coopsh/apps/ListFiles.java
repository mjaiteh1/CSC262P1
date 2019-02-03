package edu.smith.cs.csc262.coopsh.apps;

import edu.smith.cs.csc262.coopsh.ShellEnvironment;
import edu.smith.cs.csc262.coopsh.Task;
import java.io.File;

public class ListFiles extends Task{

	File workingDir;

	public ListFiles(ShellEnvironment env, String[] args) {
		super(env, args);
		this.workingDir = env.currentDirectory;

	}

	@Override
	protected void update() {
		System.out.println(workingDir.getAbsolutePath());
		this.println(workingDir.getAbsolutePath());
		this.closeOutput();
		this.exit(0);
	}

}
