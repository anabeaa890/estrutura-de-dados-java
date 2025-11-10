public class Node {
    int dado;
    Node proximo;

    public Node(int dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public void mostrarNo() {
        System.out.print(dado + " ");
    }

    public static void main(String[] args) {
        Node primeiro = new Node(10);
        Node segundo = new Node(20);
        primeiro.proximo = segundo;

        System.out.println("Lista de nós:");
        Node atual = primeiro;
        while (atual != null) {
            atual.mostrarNo();
            atual = atual.proximo;
        }
        System.out.println();
    }
}
