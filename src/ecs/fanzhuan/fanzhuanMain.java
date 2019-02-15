package ecs.fanzhuan;

import ecs.Node;

public class fanzhuanMain {

    public static void main(String[] args) {
        Node node = InitData.initNode("1", "2", "3", "4", "5", "null", "7");
        fz(node);
        PrintNodeTree.printTree(node);
    }

    public static void fz(Node node) {
        if (node == null)
            return;
        Node tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        if (node.left != null) {
            fz(node.left);
        }
        if (node.right != null) {
            fz(node.right);
        }
    }
}
//测试结果：
/*
 1
--------------------------------
 2  3
--------------------------------
 4  5  null  7
--------------------------------
nullnullnullnullnullnullnullnull
--------------------------------
 1
--------------------------------
 3  2
--------------------------------
 7  null  5  4
--------------------------------
nullnullnullnullnullnullnullnull
 */
