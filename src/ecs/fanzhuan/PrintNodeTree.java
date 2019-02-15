package ecs.fanzhuan;

import ecs.Node;

import java.util.LinkedList;

public class PrintNodeTree {

    /**
     * 按照层级打印二叉树
     * @param node
     */
    public static void printTree(Node node) {
        LinkedList<Node> queue = new LinkedList();
        queue.add(node);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int z = 0; z < size; z++) {
                Node top = queue.pop();
                if (top == null) {
                    System.out.print("null");
                    continue;
                }
                System.out.print(" " + top.data + " ");
                queue.add(top.left);
                queue.add(top.right);
            }
            System.out.println(" ");
            System.out.println("-------------------------------- ");
        }

    }
}
