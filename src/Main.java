import lib.Node;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nodes = in.nextInt();
        Node root = new Node(in.nextInt());
        for (int i = 0; i < nodes - 1; i++) {
            root.insert(in.nextInt());
        }

        bfs(root);

        dfs(root);

    }

    private static void bfs(Node root) {
        ArrayList<Node> currentLevel = new ArrayList<>();
        currentLevel.add(root);
        int levels = -1;
        while(currentLevel.size() > 0) {
            levels++;
            ArrayList<Node> nextLevel = new ArrayList<>();
            for (Node n : currentLevel) {
                if (n.right != null) nextLevel.add(n.right);
                if (n.left != null) nextLevel.add(n.left);
            }
            currentLevel = nextLevel;
        }

        System.out.println(levels);
    }

    private static void dfs(Node root) {

        int height = Math.max(height(root.left), height(root.right));

        System.out.println(height);
    }

    private static int height(Node root) {
        if (root != null) {
            return 1 + Math.max(height(root.left), height(root.right));
        }
        return 0;
    }

}
