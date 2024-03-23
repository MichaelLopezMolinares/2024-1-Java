package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Mascota;
import co.edu.unbosque.model.Veterinaria;
import co.edu.unbosque.model.persistence.VeterinariaDAO;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.VistaConsola;

public class Controller implements ActionListener {

	private VistaConsola vista;
	private VentanaPrincipal ventana;
	private VeterinariaDAO veterinariaDAO;
	private Veterinaria veterinaria;

	public Controller() {
		ventana = new VentanaPrincipal();
		veterinaria = new Veterinaria();
		veterinariaDAO = new VeterinariaDAO(veterinaria.getClientes());
		agregarLectores();
	}

	public void agregarLectores() {
		ventana.getPanelAccion().getbActivar().addActionListener(this);

		ventana.getPanelOpciones().getbAgregar().addActionListener(this);
		ventana.getPanelOpciones().getbEliminar().addActionListener(this);
		ventana.getPanelOpciones().getbMostrar().addActionListener(this);
		ventana.getPanelOpciones().getbEncontrar().addActionListener(this);
		ventana.getPanelOpciones().getbModificar().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "ACTIVAR":
				String aux = ventana.getPanelAccion().getEnunciado2().getText();
				String nombre = ventana.getPanelAccion().getNombreMascota().getText();
				String nombreNuevo = ventana.getPanelAccion().getNombreNuevo().getText();
				String tipo = ventana.getPanelAccion().getTipoMascota().getText();


				Mascota mascotaAuxiliar = new Mascota(nombre, tipo);


				if (aux.contains("Desea agregar")) {
					if (nombre.isBlank() || tipo.isBlank()) {
						ventana.getPanelTexto().getResultados().setText("Debe ingresar un valor para ambos campos");
					} else if (!veterinariaDAO.add(mascotaAuxiliar)) {
						ventana.getPanelTexto().getResultados().setText("No fue posible la insercion de " + "\n esta mascota");
						ventana.getPanelAccion().getNombreMascota().setText("");
						ventana.getPanelAccion().getTipoMascota().setText("");
					} else {
						ventana.getPanelTexto().getResultados().setText(mascotaAuxiliar.getNombre() + " Ha sido insertado exitosamente");
						ventana.getPanelAccion().getNombreMascota().setText("");
						ventana.getPanelAccion().getTipoMascota().setText("");
					}
				} else if (aux.contains("Desea eliminar")) {
					if (!veterinariaDAO.delete(mascotaAuxiliar)) {
						ventana.getPanelTexto().getResultados().setText("No fue posible la eliminacion de " + "\n" + mascotaAuxiliar.getNombre());
						ventana.getPanelAccion().getNombreMascota().setText("");
						ventana.getPanelAccion().getTipoMascota().setText("");
					} else {
						ventana.getPanelTexto().getResultados().setText(mascotaAuxiliar.getNombre() + " Ha sido eliminado exitosamente");
						ventana.getPanelAccion().getNombreMascota().setText("");
						ventana.getPanelAccion().getTipoMascota().setText("");
					}
				} else if (aux.contains("Desea buscar")) {
					if (veterinariaDAO.find(mascotaAuxiliar) != null) {
						ventana.getPanelTexto().getResultados().setText(mascotaAuxiliar.toString());
						ventana.getPanelAccion().getNombreMascota().setText("");
						ventana.getPanelAccion().getTipoMascota().setText("");
					} else {
						ventana.getPanelTexto().getResultados().setText("No se ha encontrado a " + "\n" + mascotaAuxiliar.getNombre() + "o hubo algun error");
						ventana.getPanelAccion().getNombreMascota().setText("");
						ventana.getPanelAccion().getTipoMascota().setText("");
					}

				} else if (aux.contains("Desea modificar")) {
					if (veterinariaDAO.find(mascotaAuxiliar) != null) {
						mascotaAuxiliar = veterinariaDAO.find(mascotaAuxiliar);
						Mascota mascotaNueva = new Mascota(nombreNuevo, tipo);
						if (veterinariaDAO.update(mascotaAuxiliar, mascotaNueva)) {
							ventana.getPanelTexto().getResultados().setText(mascotaNueva.getNombre() + " se ha modificado con exito");
							ventana.getPanelAccion().getNombreMascota().setText("");
							ventana.getPanelAccion().getNombreNuevo().setText("");
							ventana.getPanelAccion().getTipoMascota().setText("");
						} else {
							ventana.getPanelTexto().getResultados().setText(mascotaNueva.getNombre() + " no se ha modificado");
							ventana.getPanelAccion().getNombreMascota().setText("");
							ventana.getPanelAccion().getNombreNuevo().setText("");
							ventana.getPanelAccion().getTipoMascota().setText("");
						}
					} else {
						ventana.getPanelTexto().getResultados().setText("La mascota no existe");
						ventana.getPanelAccion().getNombreMascota().setText("");
						ventana.getPanelAccion().getNombreNuevo().setText("");
						ventana.getPanelAccion().getTipoMascota().setText("");
					}
				}



					break;
					case "GUARDAR":
						ventana.getPanelAccion().getEnunciado1().setText("Que mascota");
						ventana.getPanelAccion().getEnunciado2().setText("Desea agregar");
						ventana.getPanelAccion().getLabelTipo().setText("Tipo");
						ventana.getPanelAccion().getLabelTipo().setBounds(15, -60, 500, 380);
						ventana.getPanelAccion().getLabelTipo().setVisible(true);
						ventana.getPanelAccion().getTipoMascota().setBounds(15, 137, 100, 25);
						ventana.getPanelAccion().getTipoMascota().setVisible(true);
						ventana.getPanelAccion().getLabelNombreNuevo().setVisible(false);
						ventana.getPanelAccion().getNombreNuevo().setVisible(false);
						ventana.getPanelAccion().getbActivar().setText("Agregar");
						break;
					case "ELIMINAR":
						ventana.getPanelAccion().getEnunciado1().setText("Que mascota");
						ventana.getPanelAccion().getEnunciado2().setText("Desea eliminar");
						ventana.getPanelAccion().getLabelTipo().setVisible(false);
						ventana.getPanelAccion().getTipoMascota().setVisible(false);
						ventana.getPanelAccion().getLabelNombreNuevo().setVisible(false);
						ventana.getPanelAccion().getNombreNuevo().setVisible(false);
						ventana.getPanelAccion().getbActivar().setText("Eliminar");
						break;
					case "MOSTRAR":
						ventana.getPanelTexto().getResultados().setText(veterinariaDAO.getAll());
						break;
					case "BUSCAR":
						ventana.getPanelAccion().getEnunciado1().setText("Que mascota");
						ventana.getPanelAccion().getEnunciado2().setText("Desea buscar");

						ventana.getPanelAccion().getLabelNombreNuevo().setVisible(false);
						ventana.getPanelAccion().getNombreNuevo().setVisible(false);
						ventana.getPanelAccion().getLabelTipo().setVisible(false);
						ventana.getPanelAccion().getTipoMascota().setVisible(false);
						ventana.getPanelAccion().getbActivar().setText("Buscar");
						break;
					case "MODIFICAR":
						ventana.getPanelAccion().getEnunciado1().setText("Que mascota");
						ventana.getPanelAccion().getEnunciado2().setText("Desea modificar");

						ventana.getPanelAccion().getLabelNombreNuevo().setVisible(true);
						ventana.getPanelAccion().getNombreNuevo().setVisible(true);

						ventana.getPanelAccion().getLabelTipo().setText("Tipo nuevo");
						ventana.getPanelAccion().getLabelTipo().setVisible(true);
						ventana.getPanelAccion().getLabelTipo().setBounds(120, -60, 500, 380);
						ventana.getPanelAccion().getTipoMascota().setVisible(true);
						ventana.getPanelAccion().getTipoMascota().setBounds(120, 137, 100, 25);

						ventana.getPanelAccion().getbActivar().setText("Modificar");

						break;
			default:
				throw new IllegalStateException("Unexpected value: " + e.getActionCommand());
		}
		}
	}