package ListaEncadeada;

public class Teste {

    public static void main(String[] args) {

        // testeAdicionaFinal();
        // testeGetPorPosicao();
        // testeAdicionaPorPosicao();
         testeRemovePorPosicao();
    }

    public static void testeAdicionaFinal() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);

        System.out.println("Lista: " + lista);
        System.out.println("Tamanho: " + lista.getTamanho());
    }

    public static void testeGetPorPosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);

        System.out.println("Lista para teste: " + lista);

        System.out.println("Posição 0: " + lista.get(0));
        System.out.println("Posição 2: " + lista.get(2));
        System.out.println("Posição 3 (inválida): " + lista.get(3));
    }

    public static void testeAdicionaPorPosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.adiciona(10);
        lista.adiciona(30);

        System.out.println("Lista inicial: " + lista);

        lista.adiciona(0, 5); // Adiciona no início
        lista.adiciona(2, 20); // Adiciona no meio
        lista.adiciona(4, 40); // Adiciona no final

        System.out.println("Lista após adições: " + lista);

        boolean resultadoInvalido = lista.adiciona(7, 99);
        System.out.println("Tentou adicionar em posição inválida (7): " + resultadoInvalido);
        System.out.println("Lista final: " + lista);
    }

    public static void testeRemovePorPosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);

        System.out.println("Lista inicial: " + lista);

        System.out.println("Removeu da posição 3: " + lista.remove(3));
        System.out.println("Lista: " + lista);

        System.out.println("Removeu da posição 0: " + lista.remove(0));
        System.out.println("Lista: " + lista);

        System.out.println("Removeu da última posição 2: " + lista.remove(2));
        System.out.println("Lista: " + lista);
    }
}