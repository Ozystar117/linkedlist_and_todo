/**
 * 
 */
package run;

import linkearList.LinearList;
import linkedLinearList.LinkedLinearList;
import todo.ToDo;
import todo.ToDoList;

/**
 * @author Emmanuel Ozioma
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinearList l = new LinkedLinearList();
		System.out.println(l.outputList());
		l.add(0, "a");
		l.add(1, "b");
		list(l);
//		l.add(0, "c");
//		l.add(3, "d");
//		l.add(4, "e");
		list(l);
		//l.remove(1);
		System.out.println("removed " + l.remove(0));
		list(l);
		System.out.println("Index of: " + l.indexOf("g"));
		System.out.println(l.outputList());
		ToDoList todoList = new ToDoList();
		ToDo toDo1 = new ToDo("clean");
		ToDo toDo2 = new ToDo("read");
		ToDo toDo3 = new ToDo("code");
		todoList.add(0, toDo1);
		todoList.add(1, toDo2);
		todoList.add(2,  toDo3);
		todoList.add(3, toDo3);
		//todoList.showTodos();
		todoList.viewToDo(2);
		todoList.findTodo("sleep");
		todoList.findTodo("code");
	}
	
	private static void list(LinearList l) {
		System.out.println("Listing");
		for(int i = 0; i < l.size(); i++) {

			System.out.println(l.get(i));
		}
		System.out.println(l.size());
	}

	
}
