package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Mascota;

public class VeterinariaDAO implements interfaceDAO<Mascota>{

	private ArrayList<MascotaDTO> datos;

	public VeterinariaDAO(ArrayList<Mascota> x) {
		datos = MapHandler.convertirVeterinariaToVeterinariaDTO(x);
	}

	@Override
	public String getAll() {
		String rta = "";
		ArrayList<Mascota> datos2 = new ArrayList<Mascota>();
		datos2 = MapHandler.convertirVeterinariaDTOToVeterinaria(datos);
		if(!datos.isEmpty()) {
			for (Mascota mascota : datos2) {
				rta += mascota + "\n";
			}
		}
		return rta;
	}

	@Override
	public boolean add(Mascota x) {
    Mascota resultado = find(x);
		if( resultado== null) {
			datos.add(MapHandler.convertirMascotaToMascotaDTO(x));
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Mascota x) {
		MascotaDTO dtoMascota = MapHandler.convertirMascotaToMascotaDTO(find(x));
		if(dtoMascota != null) {
			datos.removeIf( e -> e.getNombre().equals(dtoMascota.getNombre()));
			return true;
		}
		return false;
	}

	@Override
	public Mascota find(Mascota x) {

		Boolean ifFound = false;
		if(!datos.isEmpty()) {
			for (MascotaDTO mascota : datos) {
				if(mascota.getNombre().equals(x.getNombre())) {
					x.setTipo(mascota.getTipo());
					ifFound = true;
					break;
				}
			}
		}


		return ifFound ? x:null;
	}

	@Override
	public boolean update(Mascota x, Mascota nueva) {
		MascotaDTO dtoMascota = MapHandler.convertirMascotaToMascotaDTO(find(x));
		if(dtoMascota != null) {
			datos.removeIf( e -> e.getNombre().equals(dtoMascota.getNombre()));
			dtoMascota.setNombre(nueva.getNombre());
			dtoMascota.setTipo(nueva.getTipo());
			datos.add(dtoMascota);
			return true;
		}
		return false;
	}

	public ArrayList<MascotaDTO> getDatos() {
		return datos;
	}

}
