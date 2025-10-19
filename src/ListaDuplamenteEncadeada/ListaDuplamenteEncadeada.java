package ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {

    private Nodo<T> primeiro;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
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
            novoNodo.setProx(primeiro);
            novoNodo.setAnt(primeiro);
        } else {
            Nodo<T> ultimo = this.primeiro.getAnt();
            novoNodo.setProx(this.primeiro);
            this.primeiro.setAnt(novoNodo);
            novoNodo.setAnt(ultimo);
            ultimo.setProx(novoNodo);
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

        if (index == 0) {
            adicionaInicio(elemento);
            return true;
        }

        if (index == this.tamanho) {
            adiciona(elemento);
            return true;
        }

        Nodo<T> novoNodo = new Nodo<>(elemento);
        Nodo<T> atual = this.get(index);
        Nodo<T> anterior = atual.getAnt();

        novoNodo.setProx(atual);
        atual.setAnt(novoNodo);
        anterior.setProx(novoNodo);
        novoNodo.setAnt(anterior);

        this.tamanho++;
        return true;
    }

    private void adicionaInicio(T elemento) {
        adiciona(elemento);
        this.primeiro = this.primeiro.getAnt();
    }

    public boolean remove(int index) {
        if (index < 0 || index >= this.tamanho || this.primeiro == null) {
            return false;
        }

        if (this.tamanho == 1) {
            this.primeiro = null;
        } else {
            Nodo<T> nodoARemover = this.get(index);
            Nodo<T> anterior = nodoARemover.getAnt();
            Nodo<T> proximo = nodoARemover.getProx();

            anterior.setProx(proximo);
            proximo.setAnt(anterior);

            if (index == 0) {
                this.primeiro = proximo;
            }
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

        for(int i = 0; i < this.tamanho; i++) {
            builder.append(ponteiro.getValor());
            if (i < this.tamanho - 1) {
                builder.append(", ");
            }
            ponteiro = ponteiro.getProx();
        }

        builder.append("]");
        return builder.toString();
    }
}