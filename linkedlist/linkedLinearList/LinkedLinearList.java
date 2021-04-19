/**
 * 
 */
package linkedLinearList;

import linkearList.LinearList;
import linknode.LinkNode;

/**
 * @author Emmanuel Ozioma
 *
 */
public class LinkedLinearList<Object> implements LinearList<Object>{

	protected LinkNode<Object> head;
	protected int size;
	
	public LinkedLinearList() {
		head = null;
	}
	
	@Override
	public boolean isEmpty() {
		//return true if the list is empty
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}
	
	private void checkIndex(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
		}
	}

	private void checkAddIndex(int index) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index = " + index + " size = " + size);
		}
	}
	
	@Override
	public Object get(int index) {
		checkIndex(index);
		LinkNode<Object> current;
		current = head;
		for(int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.theObject;
	}

	@Override
	public int indexOf(Object object) {
		int index = -1;
		for(int i = 0; i < size(); i++) {
			Object current = get(i);
			if(current.equals(object)) {
				index = i;
			}
		}
		return index;
	}

	@Override
	public Object remove(int index) {
		checkIndex(index);
		//Object removedObject = null;
		LinkNode<Object> removedNode = null;
		if(index == 0) {
			//removedObject = head.theObject;
			removedNode = head;
			head = head.next;
			
		}else {
			LinkNode<Object> current = head;
			for(int i = 0; i < index; i++) {
				if(i == index - 1)
				{
					//removedObject = current.next.theObject;
					removedNode = current.next;
					current.next = current.next.next;
				}
				current = current.next;
				
			}
		}
		size--;
		return removedNode.theObject;
	}

	@Override
	public void add(int index, Object theObject) {
		checkAddIndex(index);
		if(index == 0) {
			head = new LinkNode<Object>(theObject, head);
		}else {
			LinkNode<Object> current = head;
			for(int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			current.next = new LinkNode<Object>(theObject, current.next);
		}
		size++;
	}

	@Override
	public String outputList() {
		StringBuffer s = new StringBuffer("[");
		for(int i = 0; i < size; i++) {
			s.append(get(i).toString() + ", ");
		}
		if(size() > 0) {
			s.delete(s.length() - 2, s.length());
		}

		s.append("]");
		return new String(s);
	}

}
