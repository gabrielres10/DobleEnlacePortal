package main;

import model.ListaDoblePortal;
import model.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDoblePortal<Integer> list = new ListaDoblePortal<>();
		
		list.addFirst(new Node<Integer>(2));
		list.addFirst(new Node<Integer>(10));
		list.addFirst(new Node<Integer>(14));
		list.addFirst(new Node<Integer>(6));
		list.addFirst(new Node<Integer>(9));
		list.delete(9);
		list.print();

	}

}
