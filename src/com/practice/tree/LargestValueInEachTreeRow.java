package com.practice.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValueInEachTreeRow {
    public static void main(String[] args) {
        LargestValueInEachTreeRow largestValue = new LargestValueInEachTreeRow();
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(3);
        rootNode.left.left = new TreeNode(5);
        rootNode.left.right = new TreeNode(3);
        rootNode.right = new TreeNode(2);
        rootNode.right.left = null;
        rootNode.right.right = new TreeNode(9);
        largestValue.largestValuesByBFS(rootNode);
        largestValue.largestValuesByDFS(rootNode);
    }

    public List<Integer> largestValuesByBFS(TreeNode root) {
        if(root == null)
            return new ArrayList<Integer>();

        List<Integer> ans = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int currLength = queue.size();
            int currMax = Integer.MIN_VALUE;

            for(int i=0;i<currLength; i++){
                TreeNode node = queue.remove();
                currMax = Math.max(currMax,node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            System.out.println("BFS :: " + "Max value : " + currMax + "size : " + ans.size());
            ans.add(currMax);
        }
        return ans;
    }

    List<Integer> ans = null;
    public List<Integer> largestValuesByDFS(TreeNode root) {

        ans = dfs(root,0);

        return ans;
    }

    public List<Integer> dfs(TreeNode node, int depth){
        if(node == null)
            return new ArrayList<>();

        if(depth == ans.size()){
            ans.add(node.val);
        }else{
            ans.set(depth,Math.max(ans.get(depth),node.val));
        }
        dfs(node.left, depth+1);
        dfs(node.right, depth+1);

        System.out.println("DFS :: " + "size : " + ans.size());
        return ans;
    }

}
