package practico2_7;

public class TreeWithNode {

	private TreeNode root;

	public TreeWithNode() {
		this.root = null;
	}

	public TreeWithNode(int value) {
		this.root = new TreeNode(value);
	}

	public int getRoot() {
		return this.root.getInfo();
	}

	public boolean isEmpty() {
		if (this.root == null) {
			return true;
		} else
			return false;
	}

	// metodo publico.
	// Si el arbol no tiene root, la creo y le asigno valor.
	// si ya hay raiz,
	// else ---> recursion
	public void add(int value) {
		if (this.root == null) {
			this.root = new TreeNode(value);
		} else {
			this.add(this.root, value);
		}

	}

	// metodo PRIVADO
	private void add(TreeNode actual, int value) {
		if (actual.getInfo() > value) {
			if (actual.getLeft() == null) {
				TreeNode tmp = new TreeNode(value);
				actual.setLeft(tmp);
			} else {
				this.add(actual.getLeft(), value);
			}
		} else {
			if (actual.getRight() == null) {
				TreeNode tmp = new TreeNode(value);
				actual.setRight(tmp);
			} else {
				this.add(actual.getRight(), value);
			}
		}
	}

	// publico
	public void printPreOrder() {
		printPreOrder(root);
	}

	// privado
	// recibe nodo de inicio para imprimir --->root
	// si nodo actual est� vac�o imprimir " - "
	// si no, dar info y RECURSIVIDAD
	private void printPreOrder(TreeNode actual) {
		if (actual == null) {
			System.out.print(" - ");
			return;
		} else {
			System.out.print(actual.getInfo() + " ");
			printPreOrder(actual.getLeft());
			printPreOrder(actual.getRight());
		}
	}

	// publico

	public Boolean hasElem(int value) {
		boolean has = false;
		has = hasElem(this.root, value);
		return has;
	}

	// privado
	private Boolean hasElem(TreeNode actual, int value) {
		boolean has = false;
		// situacion corte
		if (actual == null) {
			return has;
		} else if (actual.getInfo() == value) {
			return true;
		} else if (actual.getInfo() > value) {
			has = this.hasElem(actual.getLeft(), value);
		} else {
			has = this.hasElem(actual.getRight(), value);
		}
		return has;
	}

	// metodo "comun" en internet
	public boolean hasElem1(int value) {
		// funciona como cursor
		TreeNode aux = this.root;

		while (aux.getInfo() != value) {
			if (aux.getInfo() > value) {
				aux = aux.getLeft();
			} else {
				aux = aux.getRight();
			}
			// no lo encontró
			if (aux == null) {
				return false;
			}
		}
		// si salgo del while, significa que lo encontró
		return true;
	}

	// public
	public Boolean delete(int value) {
		boolean hasDelete = false;
		hasDelete = delete(this.root, value);
		return hasDelete;
	}

	private boolean delete(TreeNode current, int value) {
		TreeNode parent = root;
		boolean isLeftChild = true;

		// ciclo para mover los cursores
		while (current.getInfo() != value) {
			parent = current;

			if (current.getInfo() > value) {
				current = current.getLeft();
				isLeftChild = true;
			} else {
				current = current.getRight();
				isLeftChild = false;
			}

			// si no lo encuentra
			if (current == null) {
				return false;
			}

		} // fin del while

		// CASOS DE ELIMINACION
		// caso nodo hoja
		if ((current.getLeft() == null) && (current.getRight() == null)) {
			// si solo hay nodo raiz
			if (current == root) {
				root = null;
			}

			// hay que asignar null a parent
			if (isLeftChild) {
				parent.setLeft(null);
			} else {
				parent.setRight(null);
			}
		}
		// caso nodo con un hijo
		// nodo hijo izquierdo
		else if ((current.getLeft() != null) && (current.getRight() == null)) {
			// borrado de raiz con un hijo izquierdo
			if (current == root) {
				root = current.getLeft();
			} else {
				if (isLeftChild) {
					parent.setLeft(current.getLeft());
				} else {
					parent.setRight(current.getLeft());
				}
			}

			// caso hijo derecho
		} else if ((current.getLeft() == null) && (current.getRight() != null)) {
			if (current == root) {
				root = current.getRight();
			} else {
				if (isLeftChild) {
					parent.setLeft(current.getRight());
				} else {
					parent.setRight(current.getRight());
				}
			}
		}

		// caso nodo con 2 hijos
		else {
			if ((current.getLeft() != null) && (current.getRight() != null)) {

				// hijo derecho de nodo a borrar
				TreeNode right = current.getRight();
				// busco menor , de los mayores (mas izq. de rama derecha)
				TreeNode successor = getSuccessor(right);
				// System.out.println("\nEl nodo reemplazo es: " + successor.getInfo());
				// borro el nodo que será sucesor.
				this.delete(successor.getInfo());
				// reemplazo valor del nodo borrado , por la info del sucesor
				current.setInfo(successor.getInfo());

			}

		}
		// si llega hasta acá, hubo delete
		return true;

	}

	private TreeNode getSuccessor(TreeNode current) {
		if (current.getLeft() != null) {
			return getSuccessor(current.getLeft());
		}
		return current;
	}

	public int getHeight() {
		int countLeft = 0;
		int countRight = 0;

		if (this.root != null) {
			countLeft = this.getHeight(this.root.getLeft());
			countRight = this.getHeight(this.root.getRight());
		}

		System.out.println("Rama Izq: " + countLeft);
		System.out.println("Rama Der: " + countRight);

		if (countLeft >= countRight) {
			return countLeft;
		} else {
			return countRight;
		}
	}

	// altura del arbol
	private int getHeight(TreeNode cursor) {
		int count = 1;

		if (cursor.getLeft())


		// while ((cursor.getLeft() != null) || (cursor.getRight() != null)) {
		// 	if (cursor.getLeft() == null) {
		// 		cursor = cursor.getRight();
		// 	} else {
		// 		cursor = cursor.getLeft();
		// 	}
			System.out.println("Cursor en: " + cursor.getInfo());
			count++;
		}
		return count;
	}
}