package com.polycoding.darkwizards.util.scriptcore;

import java.text.DateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import com.polycoding.darkwizards.DarkWizardKiller;

public abstract class Task<T> extends ScriptContext {

	Date d = null;

	
	public T script;

	public Task(T script) {
		super(script);
		script = t;
		d = new Date();
	}

	public abstract void execute();

	public abstract boolean activate();

	public void log(Object o) {
		script.status = o.toString();

		System.out.printf("[DWK] -> %s  @  %s\n", o, DateFormat.getInstance()
				.format(d));
	}

	public void stopScript() {
		stopScript("Stopping...");
	}

	public void stopScript(final String s) {
		stopScript(s, false);
	}

	public void stopScript(final String s, final boolean popup) {
		if (popup)
			JOptionPane.showMessageDialog(null, s);
		log(s);
		dwk.taskList.clear();
	}

	public void sleep(final long ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
