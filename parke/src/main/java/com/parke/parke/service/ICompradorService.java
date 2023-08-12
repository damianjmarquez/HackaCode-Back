package com.parke.parke.service;

import java.util.List;

import com.parke.parke.model.Comprador;


public interface ICompradorService {

    List<Comprador> getComprador();

    boolean saveComprador(Comprador comprador);
    void deleteComprador(int id);

    Comprador findComprador(int id);
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
