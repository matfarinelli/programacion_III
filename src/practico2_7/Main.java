package practico2_7;

public class Main {

	public static void main(String[] args) {

		TreeWithNode tree = new TreeWithNode();

		TreeWithNode treeVacio = new TreeWithNode();

		// al no haber raiz, será asignado como tal
		tree.add(50);
		tree.add(35);
		tree.add(15);
		tree.add(65);
		tree.add(45);
		tree.add(17);
		tree.add(63);
		tree.add(6);
		tree.add(80);
		tree.add(66);
		tree.add(103);
		tree.add(69);
		tree.add(87);
		tree.add(98);
		tree.add(62);
		tree.add(59);
		tree.add(89);

		tree.printPreOrder();

		// System.out.println("Root:" + tree.getRoot());
		// System.out.println("Arbol vacío: " + treeVacio.isEmpty());

		// System.out.println("\nEsta el elemento 63 ? " + tree.hasElem(63));
		// System.out.println("Esta el elemento 6 ? " + tree.hasElem(6));
		// System.out.println("Esta el elemento 5 ? " + tree.hasElem(5));
		// System.out.println("Esta el elemento 80 ? " + tree.hasElem(80));
		// System.out.println("Esta el elemento 0 ? " + tree.hasElem(0));
		// System.out.println("Esta el elemento 6? " + tree.hasElem1(6));
		// System.out.println("Esta el elemento 98? " + tree.hasElem1(98));

		// caso nodo hoja
		//tree.delete(45);
		//tree.printPreOrder();

		// caso nodo 1 hijo izquierdo
		// tree.delete(66);
		// tree.printPreOrder();
		
		// System.out.println("---------------------------");
		// caso nodo 1 hijo izquierdo
		//tree.delete(103);
		// tree.printPreOrder();
				
		// caso nodo 2 hijos
		//System.out.println("Borrado de 65");
		//tree.delete(65);
		//tree.printPreOrder();
		
		System.out.println("\n---------------------------");

		tree.getHeight();
		
	}

}
