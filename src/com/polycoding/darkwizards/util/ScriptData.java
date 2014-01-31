package com.polycoding.darkwizards.util;

import java.util.ArrayList;

import com.polycoding.darkwizards.gui.GUI;
import com.polycoding.darkwizards.util.scriptcore.Task;

public enum ScriptData {
	
	public ArrayList<Task> taskList = new ArrayList<Task>();


	public int startingExperience = 0, profit = 0, foodId = 0, foodAmount = 0;

	public long startTime = 0;

	public boolean guiIsDone = false, useFood = false;

	public String status = "";

}
