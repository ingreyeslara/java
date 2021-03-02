/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viernes_25;

import javax.jws.WebService;

/**
 *
 * @author paola
 */
@WebService(serviceName = "calcular_edad_webservice") 
public class wsdl_viernes25 {

    public double altura(double altura) {
        //TODO implement this method
        return altura;
    }

    public int calcularEdad(int fechaNacimiento, int fechaActual) {
        //TODO implement this method
        return fechaActual - fechaNacimiento;
    }

    public java.lang.String carrera(java.lang.String carrera) {
        //TODO implement this method
        return carrera;
    }

    public java.lang.String alumno(java.lang.String alumno) {
        //TODO implement this method
        return alumno;
    }

    public java.lang.String universidad(java.lang.String universidad) {
        //TODO implement this method
        return universidad;
    }
    
}
