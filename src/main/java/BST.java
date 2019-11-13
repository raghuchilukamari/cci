import javax.naming.NameNotFoundException;

public class BST {

    BNode root;

    BST(BNode root){
        this.root = root;
    }

    public void search(BNode start, int value){

        if(start == null){
            return;
        }
         if(start.value == value){
             System.out.println("found " + value);
             } else {
                search(start.left,value);
                search(start.right, value);
            }
        }

    public void preOrder(BNode node){

        if(node == null){
            return;
        }
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
    }


    public void inOrder(BNode node){

        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);

    }

    public void postOrder(BNode node){

        if(node == null){
            return;
        }

        postOrder(node.left);

        postOrder(node.right);

        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        BNode root = new BNode(1,null,null);

        BST bst = new BST(root);

        bst.root.left = new BNode(2,null,null);
        bst.root.right = new BNode(3,null,null);
        bst.root.left.left = new BNode(4,null,null);
        bst.root.left.right = new BNode(5,null,null);

        //bst.search(root,3);

        System.out.println("------------ Pre order traversal order --------");
        bst.preOrder(root);
        System.out.println();

        System.out.println("------------ In order traversal order --------");
        bst.inOrder(root);
        System.out.println();

        System.out.println("------------ Post order traversal order --------");
        bst.postOrder(root);
        System.out.println();


    }

}

class BNode {

    int value;
    BNode left;
    BNode right;

    BNode (int value, BNode left, BNode right){

        this.value = value;
        this.left = left;
        this.right = right;

    }

}
