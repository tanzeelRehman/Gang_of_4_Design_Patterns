package Composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Leaf lf = new Leaf();
        System.out.println("Client: I have created a simple component:");
        System.out.println(lf.operation());

        Conatiner tree = new Conatiner();
        System.out.println("Client: I have created a simple component:");
        System.out.println(tree.operation());
//
//        Conatiner branch1 = new Conatiner();
//        branch1.addChild(new Leaf());
//        branch1.addChild(new Leaf());
//
//        Conatiner branch2 = new Conatiner();
//        branch2.addChild(new Leaf());
//
//        tree.addChild(branch1);
//        tree.addChild(branch2);
//
//        System.out.println("Client: I have created a composite tree:");
//        System.out.println(tree.operation());


    }
}
