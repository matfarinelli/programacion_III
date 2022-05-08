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

	private TreeNode delete(TreeNode actual, int value) {
		if (actual != null) {

			if (actual.getInfo() == value) {
				// nodo hoja
				if ((actual.getLeft() == null) && (actual.getRight() == null)) {
					return actual = null;
				}
				// nodo con hijos
				else {
					// nodo con 1 solo hijo
					// con nodo hijo izquierdo
					if ((actual.getLeft() != null) && (actual.getRight() == null)) {
						return actual = actual.getLeft();
					}
					// con nodo hijo derecho
					else if ((actual.getLeft() == null) && (actual.getRight() != null)) {
						return actual = actual.getRight();
					}
					// con 2 hijos
					else if ((actual.getLeft() != null) && (actual.getRight() != null)) {
						TreeNode right = actual.getRight();
						TreeNode temp = actual.getSucesor(right);

						temp.setLeft(actual.getLeft());
						return temp;
					}

				}
			}
		}

		if (actual.getInfo() > value) {
			delete(actual.getLeft(), value);
		} else {
			delete(actual.getRight(), value);
		}

		return actual;
	}

	private TreeNode getSucesor(TreeNode actual) {
		if (actual.getLeft() != null) {
			return getSucesor(actual.getLeft());
		}
		return actual;
	}

	/*
	 * // private
	 * private Boolean delete(TreeNode actual, int value) {
	 * boolean hasDelete = false;
	 * if (actual == null) {
	 * return hasDelete;
	 * } else if (actual.getInfo() == value) {
	 * TreeNode nodeReplace = actual;
	 * 
	 * // cuando lo encuentro, seteo y borro el reemplazo
	 * // deber�a ser un m�todo recursivo
	 * 
	 * actual.setInfo(null);
	 * 
	 * hasDelete = true;
	 * } else if (actual.getInfo() > value) {
	 * hasDelete = this.delete(actual.getLeft(), value);
	 * } else if (actual.getInfo() < value) {
	 * hasDelete = this.delete(actual.getRight(), value);
	 * }
	 * return hasDelete;
	 * }
	 * 
	 * private TreeNode getReplace(TreeNode actual) {
	 * TreeNode reeplace = actual;
	 * 
	 * // nodo hoja
	 * if ((actual.getLeft() == null) && (actual.getRight() == null))
	 * 
	 * return replace;
	 * }
	 */

}