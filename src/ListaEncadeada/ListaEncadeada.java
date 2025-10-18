package ListaEncadeada;

public class ListaEncadeada<T> {

    private Nodo<T> primeiro;
    private int tamanho;

    public ListaEncadeada() {
        this.primeiro = null;
        this.tamanho = 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void adiciona(T elemento) {
        Nodo<T> novoNodo = new Nodo<>(elemento);

        if (this.primeiro == null) {
            this.primeiro = novoNodo;
        } else {
            Nodo<T> ponteiro = this.primeiro;
            while (ponteiro.getProx() != null) {
                ponteiro = ponteiro.getProx();
            }
            ponteiro.setProx(novoNodo);
        }
        this.tamanho++;
    }

    public Nodo<T> get(int index) {
        if (index < 0 || index >= this.tamanho) {
            return null;
        }

        Nodo<T> ponteiro = this.primeiro;
        for (int i = 0; i < index; i++) {
            ponteiro = ponteiro.getProx();
        }
        return ponteiro;
    }

    public boolean adiciona(int index, T elemento) {
        if (index < 0 || index > this.tamanho) {
            return false;
        }

        Nodo<T> novoNodo = new Nodo<>(elemento);

        if (index == 0) {
            novoNodo.setProx(this.primeiro);
            this.primeiro = novoNodo;
        } else {
            Nodo<T> anterior = this.get(index - 1);
            novoNodo.setProx(anterior.getProx());
            anterior.setProx(novoNodo);
        }

        this.tamanho++;
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= this.tamanho) {
            return false;
        }

        if (index == 0) {
            this.primeiro = this.primeiro.getProx();
        } else {
            Nodo<T> anterior = this.get(index - 1);
            Nodo<T> nodoARemover = anterior.getProx();
            anterior.setProx(nodoARemover.getProx());
        }

        this.tamanho--;
        return true;
    }

    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Nodo<T> ponteiro = this.primeiro;

        while (ponteiro != null) {
            builder.append(ponteiro.getValor());
            if (ponteiro.getProx() != null) {
                builder.append(", ");
            }
            ponteiro = ponteiro.getProx();
        }

        builder.append("]");
        return builder.toString();
    }
}