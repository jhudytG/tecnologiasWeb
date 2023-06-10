package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Empleados;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-10T18:24:32")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, Integer> idDep;
    public static volatile CollectionAttribute<Departamento, Empleados> empleadosCollection;
    public static volatile SingularAttribute<Departamento, String> nombre;

}