package ecs.dayinsuoyou;

import ecs.InitData;
import ecs.Node;

public class dayinsuoyouMain {

    public static void main(String[] str) {
        Node node = InitData.initNode("1", "2", "3", "4", "5", "6", "7", "8");
        dayinsuoyou(node, "");
    }

    public static void dayinsuoyou(Node root, String linkString) {
        if (root == null) {
            return;
        }
        if ("".equals(linkString)) {
            linkString = root.data;
        } else {
            linkString = root.data + "," + linkString;
        }

        if (root.left == null && root.right == null) {
            System.out.println(linkString);
        }

        if (root.left != null) {
            dayinsuoyou(root.left, linkString);
        }
        if (root.right != null) {
            dayinsuoyou(root.right, linkString);
        }


    }
}
