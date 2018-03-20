package ru.itis.Sem2;

public class Tree {
    private Tree leftBranch;
    private Tree rightBranch;
    private int root;

    public Tree(int root) {
        this.root = root;
    }

    public void insert(Tree tree) {
        if (tree.root < root)
            if (leftBranch != null) leftBranch.insert(tree);
            else leftBranch = tree;
        else if (rightBranch != null) rightBranch.insert(tree);
        else rightBranch = tree;
    }

    public void print() {
        if (leftBranch != null)
            leftBranch.print();

        System.out.print(this.root+" ");

        if (rightBranch != null)
            rightBranch.print();
    }
}
