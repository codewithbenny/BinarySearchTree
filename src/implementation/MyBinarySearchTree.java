package implementation;

public class MyBinarySearchTree<E extends Comparable<E>> {
    private Node<E> root;

    // insert
    public void insert(E element){
        Node<E> node=new Node<>(element);
        // Empty
        if(isEmpty()){
            root = node;
        }else{
             Node<E> temp = root;
             Node<E> parent = null;
             while (temp !=null){
                 parent = temp;
                 if(element.compareTo(temp.getData())<=0){
                     // left Subtree
                     temp=temp.getLeft();


                 }else {
                     temp = temp.getRight();

                 }
             }
             //
            if(element.compareTo(parent.getData())<=0){
                parent.setLeft(node);
            }else {
                parent.setRight(node);
            }
        }
    }
    // Search
    public boolean Search(E searchElement){
        boolean response = false;
        Node<E> temp =root;
        while (temp !=null){
            if(searchElement.compareTo(temp.getData())==0){
                response = true;
                break;
            }else if (searchElement.compareTo(temp.getData())<0){
                temp.getLeft();
            }else{
                temp=temp.getRight();
            }
        }

        return response;
    }
     // Traversal
    public void preOrder(Node<E> node){
    if(node!=null){
        // Step1
        System.out.print(node.getData()+",");
        //Step 2 process sub tree
        preOrder(node.getLeft());
        //Step3
        preOrder(node.getRight());
    }
    }
    private boolean isEmpty() {
        if(root == null){
            return true;
        }
        return false;
    }
}
