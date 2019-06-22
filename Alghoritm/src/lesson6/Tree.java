package lesson6;

public class Tree {
    public Node root = null;

    public Node find(int key){
        Node current = root;
        while (current.person.id != key){
            if (key > current.person.id){
                current = current.rightChild;
            }else {
                current = current.leftChild;
            }
            if (current == null) return null;
        }
        return current;
    }
    public void insert(Number person){
        Node node = new Node();
        node.person = person;

        if (root == null) root = node;
        else {
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                if (person.num < current.person.num){
                    current = current.leftChild;
                    if (current == null) {
                    parent.leftChild = node;
                    return;}
                }else{
                    current = current.rightChild;
                    if (current == null) {
                    parent.rightChild = node;
                    return;}
                }

            }
        }
    }
    public void balanceTree(Node rootNode){
            rootNode.display();
            balanceTree(rootNode.rightChild);
    }
    public int balanceTreeL(Node rootNode){
        rootNode.display();
        if (rootNode.leftChild != null && rootNode.rightChild != null)
        {
            int k = 0;
            System.out.println();
            System.out.print("L ");
            rootNode.leftChild.display();
            k = k + balanceTreeL(rootNode.leftChild);
            int k1 = 0;
            System.out.println();
            System.out.print("R ");
            rootNode.rightChild.display();
            k1 = k1 + balanceTreeL(rootNode.rightChild);
            return k + k1 + 2;
        }
        else if (rootNode.leftChild != null && rootNode.rightChild == null)
        {
            System.out.println();
            System.out.print("L ");
            rootNode.leftChild.display();
            int k2 = balanceTreeL(rootNode.leftChild);
            return 0;
        }
        else if (rootNode.leftChild == null && rootNode.rightChild != null)
        {
            System.out.println();
            System.out.print("R ");
            rootNode.rightChild.display();
            int k3 = balanceTreeL(rootNode.rightChild);
            return 0;
        }
        return 0;
    }
    //public boolean delete(int id){}
    //public void displayTree(){}
    public Node min() {

        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }

        return last;
    }

    public Node max() {

        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }

        return last;
    }

}
