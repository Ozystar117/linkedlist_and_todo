/**
 * 
 */
package todo;

import linkearList.LinearList;
import linkedLinearList.LinkedLinearList;

/**
 * @author Emmanuel Ozioma
 *
 */
public class ToDoList {
	private LinearList<ToDo> allTasks;
	private LinearList<ToDo> completedTasks;
	
	public ToDoList() {
		allTasks = new LinkedLinearList<ToDo>();
		completedTasks = new LinkedLinearList<ToDo>();
	}
	
	public void add(int index, ToDo toDo) {
		allTasks.add(index, toDo);
	}
	
	public void printDetails() {
		System.out.println(allTasks.outputList());
	}
	
	public ToDo getToDo(int index) {
		return allTasks.get(index);
	}
	
	public void viewToDo(int index) {
		System.out.println(allTasks.get(index));
	}
	
	public void getIndex(ToDo toDo) {
		//allTasks.indexOf(toDo);
	}
	
	public void showTodos() {
		System.out.println(allTasks.outputList());
	}
	
	public void findTodo(String todoTitle) {
		System.out.println("Finding " + todoTitle + "...");
		ToDo toDo = null;
		boolean found = false;
		for(int i = 0; i < allTasks.size(); i++) {
			toDo = allTasks.get(i);
			if(toDo.getTitle().equals(todoTitle)) {
				found = true;
				System.out.println(todoTitle + " found!");
				System.out.println("---------------");
				System.out.println(toDo);
				System.out.println("---------------");
			}
		}
		//if the todo was not found after looping,
		if(!found) {
			System.out.println(todoTitle + " not found!");
		}
		
	}
}
