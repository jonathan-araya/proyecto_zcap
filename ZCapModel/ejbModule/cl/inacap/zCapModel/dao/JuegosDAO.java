package cl.inacap.zCapModel.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.zCapModel.dto.Juego;

/**
 * Session Bean implementation class JuegosDAO
 */
@Stateless
@LocalBean
public class JuegosDAO implements JuegosDAOLocal {
	
	private static List<Juego> juegos = new ArrayList<Juego>();

    /**
     * Default constructor. 
     */
    public JuegosDAO() {
    }

	@Override
	public void save(Juego juego) {
		
		juegos.add(juego);
		
	}

	@Override
	public List<Juego> getAll() {
		return juegos;
	}

	@Override
	public void delete(Juego juego) {
		
		juegos.remove(juego);
		
	}

	@Override
	public List<Juego> filterByName(String nombre) {
		
		List<Juego> aux = new ArrayList<Juego>();
		for(Juego j: juegos) {
			if(j.getNombre().contains(nombre)) {
				aux.add(j);
			}
		}
		return aux;
	}

}
