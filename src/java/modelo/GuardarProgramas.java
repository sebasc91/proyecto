/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;
public class GuardarProgramas{

public Integer idPrograma;
public String  NombrePrograma;
private Integer idProyecto;

    public int getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombrePrograma() {
        return NombrePrograma;
    }

    public void setNombrePrograma(String NombrePrograma) {
        this.NombrePrograma = NombrePrograma;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

}        

