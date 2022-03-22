package com.srivathsan;

import java.util.ArrayList;
import java.util.Date;

class Projects
{
	protected String projectName; //Name of the project
	protected String projectId; //Identification Number for the project
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
	
	//Getter and Setter for projectId
		public String getProjectId() {
			return projectId;
		}
		public void setProjectId(String projectId) {
			this.projectId = projectId;
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
		return this.tasks.get(index);
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
		return this.issues.get(index);
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
		return this.users.get(index);
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
		return this.milestones.get(index);
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
class Tasks
{
	protected String taskName; //Name of the tasks
	protected String taskId; //Identification Number for the task
	protected String taskDescription; //Description for the task
	protected Users owner; //Owner of the task
	protected Date startDate; //Task start date
	protected Date dueDate; //Task end date
	protected enum taskStatus{Assigned, Started, Delayed, Closed}; //taskStatus mentions if the task is just assigned or started or delayed or closed
	protected enum priority{High,Medium,Low}; //taskPriority is to mention the priority of the task. It can be high, medium or low. 
	protected Milestones milestone; //milestone to which the task is associated in a project
	
	//Getter and Setter for taskName
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	//Getter and Setter for taskId
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	//Getter and Setter for taskDescription
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	
	//Getter and Setter for taskOwner
	public Users getOwner() {
		return owner;
	}
	public void setOwner(Users owner) {
		this.owner = owner;
	}
	
	//Getter and Setter for startDate and dueDate
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	//Getter and Setter for milestone
	public Milestones getMilestone() {
		return milestone;
	}
	public void setMilestone(Milestones milestone) {
		this.milestone = milestone;
	}
	
}
class Users
{
	protected String memberName;
	protected String memberId;
	protected enum position{intern,employee,leader,manager};
	protected ArrayList<Tasks> tasksAssigned;
	protected ArrayList<Issues> issuesAssigned;
	protected Milestones milestone;
	
	//Getter and Setter for memberName
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	//Getter and Setter for memberId
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	//Getter and Setter for tasksAssigned
	public ArrayList<Tasks> getTasksAssigned() {
		return tasksAssigned;
	}
	public void setTasksAssigned(ArrayList<Tasks> tasksAssigned) {
		this.tasksAssigned = tasksAssigned;
	}
	//Method to extract single assigned task 
	public Tasks getTask(int index) {
		return tasksAssigned.get(index);
	}
	
	//Getter and Setter for IssuesAssigned
	public ArrayList<Issues> getIssuesAssigned() {
		return issuesAssigned;
	}
	public void setIssuesAssigned(ArrayList<Issues> issuesAssigned) {
		this.issuesAssigned = issuesAssigned;
	}
	//Method to extract single assigned issue
	public Issues getIssueAssigned(int index) {
		return issuesAssigned.get(index);
	}
	
	//Getter and Setter for Milestone
	public Milestones getMilestone() {
		return milestone;
	}
	public void setMilestone(Milestones milestone) {
		this.milestone = milestone;
	}
	
}
class teams
{
	
}
class Milestones
{
	
}
class Issues
{
	
}
