class Lstack
{
	class node
	{
		String data;
		node next;
		
		node(String data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	private node top = null;
	
	public boolean isEmpty()
	{
		return (top==null);
	}
	
	public void push(String data)
	{
		node newNode = new node(data);
		
		if(isEmpty())
		{
			top = newNode;
			System.out.println("pushed : "+data);
		}
		else
		{
			newNode.next = top;
			System.out.println("pushed : "+data);
			top = newNode;
		}
	}
	
	public void pop()
	{
		if(isEmpty())
			System.out.println("The stack is empty");
		else
		{
			System.out.println(top.data);
			top = top.next;
		}
	}
	
	public void peek()
	{
		System.out.println(top.data);
	}
	
	public void display()
	{
		if(isEmpty())
			System.out.println("The stack is empty");
		else
		{
			node current = top;
			
			while(current != null)
			{
				System.out.print(current.data+",");
				current=current.next;
			}
		}
		System.out.println();
	}
	
}

class Ltest
{
	public static void main(String args[])
	{
		Lstack ls= new Lstack();
		ls.isEmpty();
		ls.push("D1");
		ls.push("D2");
		ls.push("D3");
		ls.display();
		ls.pop();
		ls.peek();
		ls.pop();
		ls.display();
		
	}
}