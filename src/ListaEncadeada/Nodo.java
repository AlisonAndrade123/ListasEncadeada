package ListaEncadeada;

public class Nodo<T> {

    private T valor;
    private Nodo<T> prox;

    public Nodo(T valor) {
        this.valor = valor;
        this.prox = null;
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

    public String toString() {
        return "Nodo{" + "valor=" + valor + '}';
    }
}