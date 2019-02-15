package ecs.fanzhuan;

import ecs.Node;

import java.util.ArrayList;

public class InitData {

    /**
     * 构造二叉树  依照从左往右的原则   遇到没有节点的传入null
     * 例如 ：
     * InitData.initNode("1","2","3","4","5","null","7");
     * 结果：
     *  1
     * --------------------------------
     *  2  3
     * --------------------------------
     *  4  5  null  7
     * --------------------------------
     *
     * @return
     */
    public static Node initNode(String... data) {

        ArrayList<Node> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                list.add(null);
                continue;
            }
            Node node = new Node();
            node.data = data[i];
            list.add(node);
        }

        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == null)
                continue;

            if ((2 * j + 1) < list.size() && list.get(2 * j + 1) != null) {
                list.get(j).left = list.get(2 * j + 1);
            }

            if ((2 * j + 2) < list.size() && list.get(2 * j + 2) != null) {
                list.get(j).right = list.get(2 * j + 2);
            }

        }

        PrintNodeTree.printTree(list.get(0));
        return list.get(0);
    }


}
