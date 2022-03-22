package com.srivathsan;

import java.util.ArrayList;
import java.util.Date;

class Projects
{
	protected String projectName; //Name of the project
	protected String projectDescription; //Description for the project
	protected ArrayList<Tasks> tasks = new ArrayList<Tasks>(); //A project contains number of tasks. Tasks in a project
	protected ArrayList<Issues> issues = new ArrayList<Issues>(); //A project contains number of issues associated. Issues in a project
	protected ArrayList<Users> users = new ArrayList<Users>(); //A project contains number of users associated. Users in a project. 
	protected ArrayList<Milestones> milestones = new ArrayList<Milestones>();;
	protected Date startDate;
	protected Date endDate;
	
	//Getter and Setter for projectName
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	//Getter and Setter for projectDescription
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	
	//Getter and Setter for tasks
	public ArrayList<Tasks> getTasks() {
		return tasks;
	}
	public void setTasks(Tasks tasks) {
		this.tasks.add(tasks);
	}
	//Method to extract single task
	public Tasks getTask(int index) {
		return tasks.get(index);
	}
	
	//Getter and Setter for issues
	public ArrayList<Issues> getIssues() {
		return issues;
	}
	public void setIssues(Issues issues) {
		this.issues.add(issues);
	}
	//Method to extract single Issue
	public Issues getIssue(int index)
	{
		return issues.get(index);
	}
	
	//Getter and Setter for users
	public ArrayList<Users> getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users.add(users);
	}
	//Method to extract single user
	public Users getUser(int index)
	{
		return users.get(index);
	}
	
	//Getter and Setter for milestones
	public ArrayList<Milestones> getMilestones() {
		return milestones;
	}
	public void setMilestones(Milestones milestones) {
		this.milestones.add(milestones);
	}
	//Method to extract single milestone
	public Milestones getMilestone(int index)
	{
		return milestones.get(index);
	}
	
	//Getter and Setter for startDate and endDate
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
class Issues
{
	
}
class Tasks
{
	
}
class Users
{
	
}
class Milestones
{
	
}
class Teams
{
	
}
