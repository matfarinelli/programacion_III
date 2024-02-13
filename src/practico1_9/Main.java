package practico1_9;

import practico1_9.MyIterator;
import practico1_9.MySimpleLinkedList;

public class Main {

	public static void main(String[] args) {

		MySimpleLinkedList lista1 = new MySimpleLinkedList();

		// MySimpleLinkedList lista_ordenada = new MySimpleLinkedList();

		
		lista1.insertFront(1);
		lista1.insertFront(3);
		lista1.insertFront(9);
		lista1.insertFront(15);
		lista1.insertFront(9);
		lista1.insertFront(3);
		lista1.insertFront(1);
		

		/*
		lista1.insertFront(1);
		lista1.insertFront(3);
		lista1.insertFront(9);
		lista1.insertFront(15);
		lista1.insertFront(9);
		lista1.insertFront(5);
		lista1.insertFront(8);
		*/
		
		System.out.println("Lista 1 - size: " + lista1.size());

		System.out.println(lista1.toString());
		
		MyIterator it1 = lista1.iterator();
		MyIterator it2 = lista1.iteratorReverse();
		
		System.out.println(lista1.isPalindromo(it1, it2));
		
		
	}
}
