package practico3;

import java.util.HashMap;
import java.util.Iterator;

public class GrafoDirigido<T> implements Grafo<T> {

	private HashMap<Integer, Vertice<T>> vertices;

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
		if ((this.vertices.containsKey(origen) && (this.vertices.containsKey(destino)){
			if (!existeArco(origen, destino)){
				this.vertices.get(origen).agregarArco(destino,etiqueta);
			}
		}
	}

	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contieneVertice(int verticeId) {
		// TODO Auto-generated method stub
		return false;
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
	public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cantidadVertices() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int cantidadArcos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<Integer> obtenerVertices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos() {
		// TODO Auto-generated method stub
		return null;
	}

	// metodo que llama a un vértice del grafo y le pide sus arcos
	@Override
	public Iterator<Arco<T>> obtenerArcos(int origen) {
		return this.vertices.get(origen).getArcos();
	}

}
