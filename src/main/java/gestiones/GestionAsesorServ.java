package gestiones;
import clases.AsesorServ;
import java.util.LinkedList;

public class GestionAsesorServ {

	private LinkedList<AsesorServ> lstAsesorServ = new LinkedList<>();

	public GestionAsesorServ() {
		super();
	}

	public LinkedList<AsesorServ> getLstAsesorServ() {
		return lstAsesorServ;
	}
	
	/**
	 * Metodo utilizado para agregar asesorServ con un id auto-incrementable
	 * @param asesorServ asesorServ de tipo AsesorServ
	 * @return true - si todo se realizo correctamente
	 */
	public boolean Agregar(AsesorServ asesorServ) {
		asesorServ.set_codigo(lstAsesorServ.size()+1);
		lstAsesorServ.add(asesorServ);
		return true;
	}
	
		/**
		 * Metodo para modificar o reemplazar un elemento de la coleccion
		 * @param posicion del elemento a modificar
		 * @param nuevoAsesorServ elemento a reemplazar
		 * @return
		 */
		public boolean Modificar(int posicion, AsesorServ nuevoAsesorServ) {
			if(posicion<0 || posicion>lstAsesorServ.size()) {
				return false;
			}else{
				int posicionEncontrada=BuscarPorcodigo(nuevoAsesorServ.get_codigo());
				if(posicionEncontrada==-1 || posicionEncontrada==posicion) {
					lstAsesorServ.set(posicion, nuevoAsesorServ);
					return true;
				}else {
					return false;
				}
			}
		}
		
		/**
		 * Metodo para eliminar elementos de la coleccion
		 * @param posicion del elemento a eliminar
		 * @return true - si todo se realizo correctamente
		 */
		public boolean Eliminar(int posicion) {
			if(posicion<0 || posicion>lstAsesorServ.size()) {
				return false;
			}else {
				lstAsesorServ.remove(posicion);
				return true;
			}
		}
		/**
		 * Metodo para buscar elementos de la coleccion por su codigo
		 * @param codigo del elemento a buscar
		 * @return posicion del elemento
		 */
		public int BuscarPorcodigo(int codigo) {
			int posicion=-1;
			for(int i=0; i <lstAsesorServ.size(); i++) {
				if(lstAsesorServ.get(i).get_codigo()==codigo) {
					posicion = i;
					break;
				}
			}
			return posicion;
		}
		/**
		 * Metodo para buscar elementos de la coleccion por su codigo
		 * @param codigo del elemento a buscar
		 * @return elemento de la coleccion
		 */
		public AsesorServ BuscarPorcodigoGetElem(int codigo) {
			AsesorServ asesorServObtenido=null;
			for(int i=0; i <lstAsesorServ.size(); i++) {
				if(lstAsesorServ.get(i).get_codigo()==codigo) {
					asesorServObtenido=lstAsesorServ.get(i);
					break;
					
				}
			}
			return asesorServObtenido;
		}
		
		/**
		 * Imprime todos los elementos de la coleccion
		 */
		public void ImprimirTodos() {
			for(int i=0;i<lstAsesorServ.size();i++) {
				System.out.println(lstAsesorServ.get(i));
			}
		}
		
		public AsesorServ getElementoPorPosicion(int posicion) {
			return lstAsesorServ.get(posicion);
			
		}
}
