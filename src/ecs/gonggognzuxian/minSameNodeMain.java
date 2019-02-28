package ecs.gonggognzuxian;

import ecs.InitData;
import ecs.Node;

import java.util.ArrayList;

/**
 * 查找二叉树最小公共父节点
 * 1
 * --------------------------------
 * 2  3
 * --------------------------------
 * 4  5  6  7
 * --------------------------------
 * 例如： 4 和 5  最小公共父节点是 2
 * 4 和 6  最小公共父节点是 1
 */
public class minSameNodeMain {
    public static ArrayList<String> list = new ArrayList();

    public static void main(String[] str) {
        Node node = InitData.initNode("1", "2", "3", "4", "5", "6", "7");
        Node one = node.left.left;//4
        Node two = node.right.right;//7
        String path = "";
        getLinkPath(node, one, two, path);

        for (String s : list) {
            System.out.println("----" + s);
        }
    }


    public static void getLinkPath(Node root, Node l, Node r, String linkPath) {
        if (root == null) {
            return;
        }

        if ("".equals(linkPath)) {
            linkPath = root.data;
        } else {
            linkPath = root.data + "," + linkPath;
        }

        if (root.left == null && root.right == null && (l.data.equals(root.data) || r.data.equals(root.data))) {
            list.add(linkPath);
        }


        if (root.left != null) {
            getLinkPath(root.left, l, r, linkPath);
        }

        if (root.right != null) {
            getLinkPath(root.right, l, r, linkPath);
        }

    }

    // TODO: 2019/2/28  还需要比较数组的最近节点
}


/*

4 和 5  最小公共父节点是 2
思路：
先把联调链路找出来
4节点的链路是 1，2，4
5节点的链路是 1，2，5
再比较两个链路的最小公共元素就是最小父节点。
 */