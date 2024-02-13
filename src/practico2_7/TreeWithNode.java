package practico2_7;

import java.util.ArrayList;
import java.util.List;

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

	public void printPostOrder() {
		printPostOrder(root);
	}

	public void printInOrder() {
		printInOrder(root);
	}

	// privado

	// recibe nodo de inicio para imprimir --->root
	// si nodo actual est� vac�o imprimir " - "
	// si no, dar info y RECURSIVIDAD

	// (b) Preorder (Root, Left, Right) : 1 2 4 5 3
	private void printPreOrder(TreeNode actual) {
		if (actual == null) {
			System.out.print(" - ");
			return;
		} else {
			// muestra y recursiona
			System.out.print(actual.getInfo() + " ");
			printPreOrder(actual.getLeft());
			printPreOrder(actual.getRight());
		}
	}

	// (c) Postorder (Left, Right, Root) : 4 5 2 3 1
	private void printPostOrder(TreeNode actual) {
		if (actual == null) {
			System.out.print(" - ");
			return;
		} else {
			printPostOrder(actual.getLeft());
			printPostOrder(actual.getRight());
			System.out.print(actual.getInfo() + " ");
		}
	}

	// (a) Inorder (Left, Root, Right) : 4 2 5 1 3
	private void printInOrder(TreeNode actual) {
		if (actual == null) {
			System.out.print(" - ");
			return;
		} else {
			printInOrder(actual.getLeft());
			System.out.print(actual.getInfo() + " ");
			printInOrder(actual.getRight());
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
		int height = 0;
		height = this.getHeight(this.root);
		return height;
	}

	public int getHeight(TreeNode current) {
		int heightLeft = 0;
		int heightRight = 0;

		if (current == null) {
			return 0;
		} else {

			// Math.max(getHeight(current.getLeft()),
			// getHeight(node.getRight()));

			heightLeft = getHeight(current.getLeft());
			// System.out.println("Nodo " + current.getInfo() + " Altura left " +
			// heightLeft);
			heightRight = getHeight(current.getRight());
			// System.out.println("Nodo " + current.getInfo() + " Altura right " +
			// heightRight);

			if (heightLeft > heightRight) {
				return heightLeft + 1;
			} else {
				return heightRight + 1;
			}
		}

	}

	// metodo publico para no pasar nodo
	// utiliza addAll, ya que el metodo privado returna listas.
	public List<Integer> getFrontera() {
		List<Integer> fronteras = new ArrayList<Integer>();
		fronteras.addAll(this.getFrontera(this.root));
		return fronteras;
	}

	private List<Integer> getFrontera(TreeNode current) {
		List<Integer> fronteras = new ArrayList<Integer>();

		// if (current == null) {
		// return null;
		// }

		if ((current.getLeft() == null) && (current.getRight() == null)) {
			fronteras.add(current.getInfo());
		} else {

			// importatisimos los if para no recursionar nodos sin hijos
			// utiliza addAll, por el hecho que el metodo recursivo devuelve listas
			if (current.getLeft() != null) {
				fronteras.addAll(getFrontera(current.getLeft()));
			}
			if (current.getRight() != null) {
				fronteras.addAll(getFrontera(current.getRight()));
			}

		}
		// para ver recursión
		System.out.println(fronteras);
		return fronteras;
	}

	public List<Integer> getLongestBranch() {
		List<Integer> longest = new ArrayList<Integer>();
		longest.addAll(getLongestBranch(this.root));
		return longest;
	}

	private List<Integer> getLongestBranch(TreeNode current) {
		List<Integer> longest_left = new ArrayList<Integer>();
		List<Integer> longest_right = new ArrayList<Integer>();
		List<Integer> longest = new ArrayList<Integer>();

		if (current == null) {
			return null;
		} else {
			// si el nodo actual es != de null , lo agrego a las listas
			if (current != null) {
				longest_left.add(current.getInfo());
				longest_right.add(current.getInfo());
			}
			// si hay nodos siguientes, itero con recursión
			if (current.getLeft() != null) {
				longest_left.addAll(getLongestBranch(current.getLeft()));
			}

			if (current.getRight() != null) {
				longest_right.addAll(getLongestBranch(current.getRight()));
			}

			if (longest_left.size() > longest_right.size()) {
				if (longest_left.size() > longest.size()) {
					longest = longest_left;
				}

			} else {
				if (longest_right.size() > longest.size()) {
					longest = longest_right;
				}

				// System.out.println(longest_right);
				// System.out.println(longest_left);
				// System.out.println(longest);

			}
		}

		return longest;

	}

	public Integer getMaxElem() {
		Integer maxElem = null;

		if (!this.isEmpty()) {
			maxElem = getMaxElem(this.root);
		}

		return maxElem;

	}

	private Integer getMaxElem(TreeNode current) {
		int maxElem = current.getInfo();

		if (current != null) {
			if (current.getRight() != null) {
				maxElem = getMaxElem(current.getRight());
			} else {
				maxElem = current.getInfo();
			}
		}
		return maxElem;
	}

	public List<Integer> getElemAtLevel(int level) {
		List<Integer> elemAtLevel = new ArrayList<Integer>();
		int i = 0;
		// el nivel solicitado tiene que ser menor o igual que la altura del arbol
		if (level <= this.getHeight()) {
			if (!this.isEmpty()) {
				i = 1;
				getElemAtLevel(this.root, level, elemAtLevel, i);
			}

		}
		return elemAtLevel;
	}

	private void getElemAtLevel(TreeNode current, int level, List<Integer> elemAtLevel, int i) {

		if (current == null) {
			return;
		}

		if (i == level) {
			// System.out.println(current.getInfo());
			elemAtLevel.add(current.getInfo());
		} else {
			i++;
			getElemAtLevel(current.getLeft(), level, elemAtLevel, i);
			getElemAtLevel(current.getRight(), level, elemAtLevel, i);
		}

	}
}