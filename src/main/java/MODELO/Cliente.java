/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

public class Cliente extends Persona {
    private boolean preferencia;

    public Cliente(int id, String nombre, String email, String telefono, boolean preferencia) {
        super(id, nombre, email, telefono);
        this.preferencia = preferencia;
    }

    public boolean getPreferencia() { return preferencia; }
    public void setPreferencia(boolean preferencia) { this.preferencia = preferencia; }
}
