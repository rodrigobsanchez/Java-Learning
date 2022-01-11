package BinaryTreeTutorial;

public interface Tree<D extends Comparable> {
     
	public boolean isEmpty();
	//size of the tree
	public int cardinality();
	
	//make it generic... adding <D> up there...
	public boolean member(D element);
	public NonEmptyBST<D> add(D element);
	
}
