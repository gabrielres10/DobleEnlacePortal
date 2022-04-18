package model;

public class ListaDoblePortal<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	public ListaDoblePortal(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public void addFirst(Node<T> node) {
		if (head == null) {
			head = node;
			tail = node;
		}else {
			node.setNext(head);
			head.setPrev(node);
			head = node;
		}
		
		size++;
	}
	
	public void addLast(Node<T> node) {
		if(tail == null) {
			tail = node;
			head = node;
		}else {
			node.setPrev(tail);
			tail.setNext(node);
			tail = node;
		}
		
		size++;
	}
	
	public void print(Node<T> node) {
		//condicion de parada
		if (node == null) {
			return;
		}
		//condicion recursivo
		System.out.println(node.getValue());
		print(node.getPrev());
	}
	
	private void delete(Node<T> current, T value) {
		//Condicion de parada
		if(current == null) {
			return;
		}
		if(current.getPrev() == null) {
			head = current.getNext();
			head.setPrev(null);
			return;
		}
		
		if(current.getNext() == null) {
			tail = current.getPrev();
			tail.setNext(null);
			return;
		}
		
		if(current.getValue().equals(value)) {
			current.getPrev().setNext(current.getNext());
			current.getNext().setPrev(current.getPrev());
			return;
		}
		
		//Metodo recursivo
		delete(current.getNext(), value);
	}
	
	public void delete(T value) {
		delete(head, value);
	}
	
	public void print() {
		print(tail);
	}
}
