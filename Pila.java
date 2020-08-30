/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineales.dinamicas;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Pila {

    private Nodo tope;

    public Pila() {
        this.tope = null;
    }

    public boolean apilar(Object nuevoElem) {
        Nodo nuevo = new Nodo(nuevoElem, this.tope);

        this.tope = nuevo;

        return true;
    }

    public boolean desapilar() {
        boolean exito = false;

        if (this.tope != null) {
            this.tope = this.tope.getEnlace();
            exito = true;
        }

        return exito;
    }

    public Object obtenerTope() {
        return this.tope.getElem();
    }

    public boolean esVacia() {
        return (this.tope == null);
    }

    public void vaciar() {
        this.tope = null;
    }

    @Override
    public String toString() {
        String cadena;

        if (this.tope == null) {
            cadena = "Pila vacia";
        } else {
            Nodo aux = this.tope;
            cadena = "[";

            while (aux != null) {
                cadena += aux.getElem().toString();
                aux = aux.getEnlace();
                if (aux != null) {
                    cadena += ",";
                }
            }
            cadena += "]";
        }
        return cadena;
    }

}
