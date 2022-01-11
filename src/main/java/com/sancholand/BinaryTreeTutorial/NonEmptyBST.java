package BinaryTreeTutorial;

public class NonEmptyBST<D extends Comparable> implements Tree<D> {
	
	D data;
	Tree<D> left;
	Tree<D> right;
	
	public NonEmptyBST(D element) {
           
			data = element;
			left = new EmptyBST<D>();
			right = new EmptyBST<D>();
	}
	
	public NonEmptyBST(D element, Tree<D> leftTree, Tree<D> rightTree) {
		
		data = element;
		left = leftTree;
		right = rightTree;
		
	}
	public boolean isEmpty() {
		return false;
	}
	
	public int cardinality() {
		return 1 + left.cardinality() + right.cardinality();
	}
	
	public boolean member(D element) {
		// data is the 'root'
		if(data == element) {
			return true;
		} else {
			if(element.compareTo(data) < 0) {
				left.member(element);
			} else { return right.member(element); }
		}
		return false;
		
	}
	public NonEmptyBST<D> add(D element){
		
		if(data == element) {
			return this;
		} 
		else {
			if(element.compareTo(data) < 0) {
				return new NonEmptyBST(data, left.add(element), right);
			}
			else {
				return new NonEmptyBST(data, left, right.add(element));
			}
		}
	}
}
