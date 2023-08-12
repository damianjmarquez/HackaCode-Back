package com.parke.parke.service;

import java.util.List;

import com.parke.parke.model.Comprador;


public interface ICompradorService {

	//método para traer a todas las personas
    //lectura
    List<Comprador> getComprador();
 
    //alta
    void saveComprador(Comprador comprador);

    //baja
    void deleteComprador(int id);

    //lectura de un solo objeto
    Comprador findComprador(int id);

    //edición/modificación
    void editComprador(int idOriginal, int idNueva,
                            String nuevoNombre,
                            String nnuevoApellido,
                            String nuevoFechNac,
                            String nnuevoDni,
                            String nuevoTelefono,
                            String nnuevoEmail
                            );

	void editComprador(Comprador comprador);
}
