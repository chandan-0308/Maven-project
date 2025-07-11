package sjb.greedymethod.TreesandGraph;

public class Binarysearchtree 
{
	TreeNode root;
	void insert(int value)
	{
		root=insertNode(root,value);
	}
	TreeNode insertNode(TreeNode node,int value)
	{
		if(node==null)
		{
			node=new TreeNode(value);
			return node;
		}
		if(value<node.data)
		{
			node.left=insertNode(node.left,value);
		}
		else if(value>node.data)
		{
			node.right=insertNode(node.right,value);
		}
		return node;
	}
	void inorder()
	{
		System.out.println("inorder");
		inorderNode(root);
	}
	void inorderNode(TreeNode node)
	{
		if(node!=null)
		{
			inorderNode(node.left);
			System.out.println(node.data);
			inorderNode(node.right);
		}
	}
	void preorder()
	{
		System.out.println("preorder");
		inpreorderNode(root);
	}
	void inpreorderNode(TreeNode node)
	{
		if(node!=null)
		{
			System.out.println(node.data);
			inpreorderNode(node.left);
			inpreorderNode(node.right);
		}
	}
	void postorder()
	{
		System.out.println("postorder");
		inpostorderNode(root);
	}
	void inpostorderNode(TreeNode node)
	{
		if(node!=null)
		{
			inpostorderNode(node.left);
			inpostorderNode(node.right);
			System.out.println(node.data);
		}
	}
	
	public static void main(String[] args)
	{
		Binarysearchtree bst=new Binarysearchtree();
		bst.insert(10);
		bst.insert(13);
		bst.insert(45);
		bst.insert(5);
		bst.insert(7);
		bst.insert(4);
		bst.insert(12);
		bst.inorder();
		bst.preorder();
		bst.postorder();
	}

}
