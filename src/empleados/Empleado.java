/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author Usuario
 */
public class Empleado {
    //atributos= datos = variables
    
    int id;
    String nombre;
    String cargo;
    int salario;
    String telefono;
    String direccion;
        
    
    //metodo especial= fotocopia = inicia la clase (Construct0r)
    public Empleado() {
    }

    public Empleado(int id, String nombre, String cargo, int salario, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    
     
    //metodos= acciones = funciones
    public int calcularSalario(){
        return(0);
    }
    

    
    
}
