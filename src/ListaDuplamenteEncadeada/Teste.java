package ListaDuplamenteEncadeada;

public class Teste {

    public static void main(String[] args) {

         // testeAdicionaFinal();
         // testeGetPorPosicao();
         // testeAdicionaPorPosicao();
         // testeRemovePorPosicao();
    }

    public static void testeAdicionaFinal() {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<Integer>();
        lista.adiciona(10);
        System.out.println(lista + " | Tamanho: " + lista.getTamanho());
        lista.adiciona(20);
        System.out.println(lista + " | Tamanho: " + lista.getTamanho());
        lista.adiciona(30);
        System.out.println(lista + " | Tamanho: " + lista.getTamanho());
    }

    public static void testeGetPorPosicao() {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<Integer>();
        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);

        System.out.println("Lista para teste: " + lista);
        System.out.println("Posição 0: " + lista.get(0));
        System.out.println("Posição 2: " + lista.get(2));
        System.out.println("Posição 3 (inválida): " + lista.get(3));
    }

    public static void testeAdicionaPorPosicao() {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<Integer>();
        lista.adiciona(10);
        lista.adiciona(30);

        System.out.println("Lista inicial: " + lista);

        lista.adiciona(0, 5);
        System.out.println("Após add(0, 5): " + lista);

        lista.adiciona(2, 20);
        System.out.println("Após add(2, 20): " + lista);

        lista.adiciona(4, 40);
        System.out.println("Após add(4, 40): " + lista);

        boolean resultadoInvalido = lista.adiciona(7, 99);
        System.out.println("Tentou add em pos 7 (inválida): " + resultadoInvalido);
        System.out.println("Lista final: " + lista);
    }

    public static void testeRemovePorPosicao() {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<Integer>();
        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);

        System.out.println("Lista inicial: " + lista);

        System.out.println("Removeu da posição 1 (valor 20): " + lista.remove(1));
        System.out.println("Lista: " + lista);

        System.out.println("Tentou remover da posição -1: " + lista.remove(-1));

        System.out.println("Tentou remover da posição 2: " + lista.remove(2));

        System.out.println("Lista final: " + lista);

        ListaDuplamenteEncadeada<Integer> listaVazia = new ListaDuplamenteEncadeada<Integer>();
        System.out.println("Lista vazia: " + listaVazia);
        System.out.println("Tentou remover da posição 0: " + listaVazia.remove(0));
    }
}