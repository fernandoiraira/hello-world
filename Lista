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
public class Lista {

    private Nodo cabecera;
    private int longitud;

    public Lista() {
        this.cabecera = null;
        this.longitud = 0;
    }

    public boolean insertar(Object elem, int pos) {
        boolean exito = true;

        if (pos < 1 || pos > this.longitud + 1) {
            exito = false;
        } else {
            if (pos == 1) {
                this.cabecera = new Nodo(elem, this.cabecera);
                this.longitud++;

            } else {
                Nodo aux = this.cabecera;
                int i = 1;

                while (i < pos - 1) {
                    i++;
                    aux = aux.getEnlace();
                }

                Nodo nuevo = new Nodo(elem, aux.getEnlace());
                aux.setEnlace(nuevo);
                this.longitud++;
            }
        }

        return exito;
    }

    public boolean eliminar(int pos) {
        boolean exito = false;

        if (pos < 1 || pos > this.longitud) {
            exito = false;
        } else {
            if (pos == 1) {
                this.cabecera = this.cabecera.getEnlace();
            } else {
                Nodo aux = this.cabecera;
                int i = 1;

                while (i < pos - 1) {
                    i++;
                    aux = aux.getEnlace();
                }

                aux.setEnlace(aux.getEnlace().getEnlace());

            }
            exito = true;
            this.longitud--;
        }
        return exito;
    }

    public Object recuperar(int pos) {
        Object recuperado = null;

        if (pos < 1 || pos > this.longitud) {

        } else {
            Nodo aux = this.cabecera;
            int i = 1;

            while (i != pos) {
                aux = aux.getEnlace();
                i++;
            }

            recuperado = aux.getElem();
        }

        return recuperado;
    }

    public int localizar(Object elemento) {
        Nodo aux = this.cabecera;
        int pos = -1, i = 1;
        boolean encontrado = false;

        while (aux != null && !encontrado) {
            if (elemento.equals(aux.getElem())) {
                encontrado = true;
                pos = i;
            } else {
                aux = aux.getEnlace();
                i++;
            }

        }

        return pos;
    }

    public int longitud() {
        return this.longitud;
    }

    public boolean esVacia() {
        return this.longitud == 0;
    }

    public void vaciar() {
        this.cabecera = null;
        this.longitud = 0;
    }

    public Lista clone() {
        Lista clon = new Lista();

        Nodo aux = this.cabecera;

        if (aux != null) {
            clon.cabecera = new Nodo(aux.getElem(), null);
            aux = aux.getEnlace();
            Nodo aux2 = clon.cabecera;

            while (aux != null) {
                Nodo nuevo = new Nodo(aux.getElem(), null);
                aux2.setEnlace(nuevo);
                aux2 = nuevo;
                aux = aux.getEnlace();
            }
        }

        clon.longitud = this.longitud;

        return clon;
    }

    @Override
    public String toString() {
        String cadena = "[";

        if (this.longitud == 0) {
            cadena = "Lista vacia";
        } else {
            Nodo aux = this.cabecera;

            while (aux != null) {
                cadena = cadena + aux.getElem() + " ";
                aux = aux.getEnlace();
            }

            cadena = cadena.trim();
            cadena = cadena + "]";
        }

        return cadena;
    }

}
