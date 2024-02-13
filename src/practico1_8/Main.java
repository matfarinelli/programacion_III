package practico1_8;

import practico1_8.MyIterator;
import practico1_8.MySimpleLinkedList;

public class Main {


	public static void main(String[] args) {

		MySimpleLinkedList lista1 = new MySimpleLinkedList();
		MySimpleLinkedList lista2 = new MySimpleLinkedList();
		MySimpleLinkedList lista3 = new MySimpleLinkedList();
		// MySimpleLinkedList lista_ordenada = new MySimpleLinkedList();

		lista1.insertFront(1);
		lista1.insertFront(3);
		lista1.insertFront(9);
		lista1.insertFront(15);
		lista1.insertFront(16);
		lista1.insertFront(19);
		lista1.insertFront(100);

		System.out.println("Lista 1 - size: " + lista1.size());

		lista2.insertFront(3);
		lista2.insertFront(1);
		lista2.insertFront(9);
		lista2.insertFront(19);
		lista2.insertFront(100);
		
		lista2.extractFront();
		
		lista2.insertLast(15);
		lista2.insertFront(7);

		//System.out.println(lista1.toString());
		
		
		System.out.println("First: " + lista2.getFirst());
		System.out.println("Last: " +lista2.getLast());//.getInfo());

		System.out.println("-----------------------");
		
		System.out.println(lista2.toString());
		
	}
}
