public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void displayNode() {
        System.out.print(data + " ");
    }

    public static void main(String[] args) {
        Node primeiro = new Node(10);
        Node segundo = new Node(20);
        primeiro.next = segundo;

        System.out.println("Lista de nos:");
        Node atual = primeiro;
        while (atual != null) {
            atual.displayNode();
            atual = atual.next;
        }
        System.out.println();
    }
}

