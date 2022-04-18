package model;

public class Node<T> {
	private T value;
	//Enlaces
	private Node<T> next;
	private Node<T> prev;
	private Node<T> portal;//Opcional (Tarea integradora)
	
	public Node(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public Node<T> getPrev() {
		return prev;
	}
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}
	public Node<T> getPortal() {
		return portal;
	}
	public void setPortal(Node<T> portal) {
		this.portal = portal;
	}
	
	
	
	
}
