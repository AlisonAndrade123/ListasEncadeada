package ListaDuplamenteEncadeada;

public class Nodo<T> {

    private T valor;
    private Nodo<T> prox;
    private Nodo<T> ant;

    public Nodo(T valor) {
        this.valor = valor;
        this.prox = null;
        this.ant = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getProx() {
        return prox;
    }

    public void setProx(Nodo<T> prox) {
        this.prox = prox;
    }

    public Nodo<T> getAnt() {
        return ant;
    }

    public void setAnt(Nodo<T> ant) {
        this.ant = ant;
    }

    public String toString() {
        return "Nodo{" + "valor=" + valor + '}';
    }
}