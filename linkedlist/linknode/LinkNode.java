/**
 * 
 */
package linknode;

/**
 * @author Emmanuel Ozioma
 *
 */
public class LinkNode<Object> {

	public Object theObject;
	public LinkNode next;
	
	/**
	 * Constructor for the linknode class
	 * @param theObject
	 * @param next
	 */
	public LinkNode(Object theObject, LinkNode next) {
		this.theObject = theObject;
		this.next = next;
	}
	
}
