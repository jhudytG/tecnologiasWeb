/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Empleados;

/**
 *
 * @author jhudy
 */
@Stateless
public class EmpleadosFacade extends AbstractFacade<Empleados> {

    @PersistenceContext(unitName = "EjerJSFPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpleadosFacade() {
        super(Empleados.class);
    }
    
}
