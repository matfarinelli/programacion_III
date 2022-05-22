package practico3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class GrafoDirigido<T> implements Grafo<T> {

	private HashMap<Integer, Vertice<T>> vertices;

	public GrafoDirigido() {
		this.vertices = new HashMap<Integer, Vertice<T>>();
	}

	@Override
	public void agregarVertice(int verticeId) {
		if (!this.vertices.containsKey(verticeId)) {
			this.vertices.put(verticeId, new Vertice<T>(verticeId));
		}
	}

	@Override
	public void borrarVertice(int verticeId) {
		if (this.vertices.containsKey(verticeId)) {

			for (Integer vertices : this.vertices.keySet()) {
				if (existeArco(vertices, verticeId)) {
					borrarArco(vertices, verticeId);
				}
			}

			this.vertices.remove(verticeId);
		}

	}

	@Override
	public void agregarArco(int origen, int destino, T etiqueta) {
		if ((this.vertices.containsKey(origen) && (this.vertices.containsKey(destino)))) {
			if (!existeArco(origen, destino)) {
				this.vertices.get(origen).agregarArco(destino, etiqueta);
			}
		}
	}

	@Override
	public void borrarArco(int origen, int destino) {
		if (existeArco(origen, destino)) {
			this.vertices.get(origen).borrarArco(destino);
		}
	}

	@Override
	public boolean contieneVertice(int verticeId) {
		return (this.vertices.containsKey(verticeId));
	}

	@Override
	public boolean existeArco(int origen, int destino) {
		Iterator<Arco<T>> itArcos = obtenerArcos(origen);

		while (itArcos.hasNext()) {
			Arco<T> actual = itArcos.next();

			if (actual.getVerticeDestino() == destino) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Arco<T> obtenerArco(int origen, int destino) {
		Iterator<Arco<T>> itArcos = obtenerArcos(origen);

		while (itArcos.hasNext()) {
			Arco<T> actual = itArcos.next();

			if (actual.getVerticeDestino() == destino) {
				return actual;
			}
		}
		return null;
	}

	@Override
	public int cantidadVertices() {
		return this.vertices.size();
	}

	@Override
	public int cantidadArcos() {
		Iterator<Arco<T>> itArcos = this.obtenerArcos();
		int cantidadArcos = 0;

		while (itArcos.hasNext()) {
			if (itArcos.next() != null) {
				cantidadArcos++;
			}

			// itArcos.next();
			// cantidadArcos++;
		}

		return cantidadArcos;

	}

	@Override
	public Iterator<Integer> obtenerVertices() {
		// keySet devuelve las claves
		Iterator<Integer> itVertices = this.vertices.keySet().iterator();
		return itVertices;
	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		// TODO Auto-generated method stub
		return null;
	}

	// pedir a cada uno de los vertices del grafo, sus arcos
	@Override
	public Iterator<Arco<T>> obtenerArcos() {
		LinkedList<Arco<T>> listaArcos = new LinkedList<Arco<T>>();

		for (Integer id : this.vertices.keySet()) {
			Iterator<Arco<T>> itArcos = this.obtenerArcos(id);
			while (itArcos.hasNext()) {
				listaArcos.add(itArcos.next());
			}
		}

		Iterator<Arco<T>> itArcosTotales = listaArcos.iterator();
		return itArcosTotales;
	}

	// metodo que llama a un vértice del grafo y le pide sus arcos en forma de
	// iterador
	@Override
	public Iterator<Arco<T>> obtenerArcos(int origen) {
		return this.vertices.get(origen).getArcos();
	}

}
