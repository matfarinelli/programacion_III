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
			System.out.println("- ");
			return;
		} else {
			System.out.println(actual.getInfo());
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

	/*
	 * // public
	 * public Boolean delete(int value) {
	 * boolean hasDelete = false;
	 * hasDelete = delete(this.root, value);
	 * return hasDelete;
	 * }
	 * 
	 * // private
	 * private Boolean delete(TreeNode actual, int value) {
	 * boolean hasDelete = false;
	 * if (actual == null) {
	 * return hasDelete;
	 * } else if (actual.getInfo() == value) {
	 * TreeNode nodeReplace = this.getReplace(actual);
	 * // cuando lo encuentro, seteo y borro el reemplazo
	 * // deber�a ser un m�todo recursivo
	 * 
	 * actual.setInfo(nodeReplace.getInfo());
	 * System.out.println("El nodo reemplazo es :" + nodeReplace.getInfo());
	 * this.replace(actual);
	 * 
	 * hasDelete = true;
	 * } else if (actual.getInfo() > value) {
	 * hasDelete = this.delete(actual.getLeft(), value);
	 * } else if (actual.getInfo() < value) {
	 * hasDelete = this.delete(actual.getRight(), value);
	 * }
	 * return hasDelete;
	 * }
	 */

	// metodo delete "comun" en internet
	public boolean delete(int value) {
		TreeNode father = root;
		TreeNode aux = root;
		boolean isLeftSon = true;

		while (aux.getInfo() != value) {
			// esta linea es para igualar los punteros y que el padre se vaya moviendo
			// tambien
			father = aux;
			if (aux.getInfo() > value) {
				aux = aux.getLeft();
				isLeftSon = true;
			} else {
				aux = aux.getRight();
				isLeftSon = false;
			}
			// no encontrado
			if (aux == null) {
				return false;
			}

		}

		// nodo hoja 
		if (aux.isLeaf()) {
			deleteNodeLeaf(father, aux, isLeftSon);
		}
		// nodo con un solo hijo
		else if ((aux.getLeft() == null) || (aux.getRight() == null)) {
			deleteSon(father, aux, isLeftSon);
		}

		return true;

	}

	// nodo hoja
	private void deleteNodeLeaf(TreeNode father, TreeNode aux, boolean isLeftSon) {
		if (aux == root) {
			root = null;
		} else if (isLeftSon) {
			father.setLeft(null);
		} else {
			father.setRight(null);
		}
	}

	// nodo con un solo hijo
	
	private void deleteSon(TreeNode father, TreeNode aux, boolean isLeftSon) {
		if (aux.getLeft() == null) {
			if (aux == root) {
				// si es raiz, apunto la referencia al hijo izq.
				root = aux.getLeft();
			} else if (isLeftSon) {
				// apunto al hijo del borrado
				father.setLeft(aux.getLeft());
			} else {
				father.setRight(aux.getLeft());
			}
		} else if (aux.getRight() == null) {
			if (aux == root) {
				root = aux.getRight();
			} else if (isLeftSon) {
				father.setLeft(aux.getRight());
			} else 
				father.setRight(aux.getRight());
		}
	}

}