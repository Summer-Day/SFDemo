package ecs.cengshu;


import ecs.InitData;
import ecs.Node;

import java.util.LinkedList;

/**
 * 二叉树层数
 */
public class cengshuMain {

    public static void main(String[] args) {
        Node node = InitData.initNode("1", "2", "3", "4", "5", "6", "7");
        System.out.println("------------");
        System.out.print("这个二叉树一共有" + getTier(node)+"层");
    }

    public static int getTier(Node node) {
        LinkedList<Node> list = new LinkedList();
        list.add(node);
        int tier = 0;
        while (!list.isEmpty()) {
            int count = list.size();
            for (int i = 0; i < count; i++) {
                Node nodeTmp = list.poll();
                if (nodeTmp != null && nodeTmp.left != null) {
                    list.add(nodeTmp.left);
                }
                if (nodeTmp != null && nodeTmp.right != null) {
                    list.add(nodeTmp.right);
                }
            }
            tier++;
        }
        return tier;
    }
}
