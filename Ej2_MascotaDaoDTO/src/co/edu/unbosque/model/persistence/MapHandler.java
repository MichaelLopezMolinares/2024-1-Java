package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.Iterator;

import co.edu.unbosque.model.Mascota;

public class MapHandler {

	public static Mascota convertirMascotaDTOtoMascota(MascotaDTO mDTO) {
		Mascota rta;
		rta = new Mascota(mDTO.getNombre(), mDTO.getTipo());
		return rta;
	}

	public static MascotaDTO convertirMascotaToMascotaDTO(Mascota m) {
		MascotaDTO rta;
		try {
			rta = new MascotaDTO();
			rta.setNombre(m.getNombre());
			rta.setTipo(m.getTipo());
		} catch(NullPointerException e) {;
			rta = null;
			return rta;
		}
		return rta;
	}

	public static ArrayList<MascotaDTO> convertirVeterinariaToVeterinariaDTO(ArrayList<Mascota> x) {
		ArrayList<MascotaDTO> rta = new ArrayList<MascotaDTO>();
		for (Mascota mascota : x) {
			rta.add(convertirMascotaToMascotaDTO(mascota));
		}
		return rta;
	}

	public static ArrayList<Mascota> convertirVeterinariaDTOToVeterinaria(ArrayList<MascotaDTO> x) {
		ArrayList<Mascota> rta = new ArrayList<Mascota>();
		for (MascotaDTO mascota : x) {
			rta.add(convertirMascotaDTOtoMascota(mascota));
		}
		return rta;
	}
	
	
}
