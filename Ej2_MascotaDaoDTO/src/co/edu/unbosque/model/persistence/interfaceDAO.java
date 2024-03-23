package co.edu.unbosque.model.persistence;

import java.util.List;

public interface interfaceDAO <T> {

	String getAll();
	
	boolean add( T x );
	
	boolean delete( T x );
	
	T find(T x);
	
	boolean update( T x , T y);
	
}
