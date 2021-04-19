package linkearList;

public interface LinearList<Object> {
	public boolean isEmpty();
	public int size();
	public Object get(int index);
	public int indexOf(Object object);
	public Object remove(int index);
	public void add(int index, Object theObject);
	public String outputList();
}
