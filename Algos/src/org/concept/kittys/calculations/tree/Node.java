package org.concept.kittys.calculations.tree;

import java.util.HashSet;
import java.util.Set;

public class Node {
	int data;
	Set<Node> nextNodes;
	
	
	public Node(int data) {
		this.data = data;
		nextNodes = new HashSet<>();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Node))
			return false;
		Node other = (Node) obj;
		if (data != other.data)
			return false;
		return true;
	}
	

}
