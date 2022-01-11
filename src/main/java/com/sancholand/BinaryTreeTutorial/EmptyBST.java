package BinaryTreeTutorial;

public class EmptyBST<D extends Comparable> implements Tree<D>{
	
	
	public EmptyBST() {
		
	}

	public boolean isEmpty() {
		return true;
	}
	public int cardinality() {
		//nothing inside the tree
		return 0;
	}
	
	
	public NonEmptyBST<D> add(D element){
		
		return new NonEmptyBST<D>(element);
		
	}


	public boolean member(D element) {
		
		return false;
	}
}
