package com.practice.array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ValidateBinaryTree {
    public static void main(String[] args) {
        ValidateBinaryTree tree = new ValidateBinaryTree();
        int n = 4;
        int[] left = {1,-1,3,-1};
        int[] right = {2,-1,-1,-1};
        tree.validateBinaryTreeNodes(n,left,right);
    }
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int root = findRoot(n,leftChild,rightChild);
        if(root == -1){
            return false;
        }
        Set<Integer> seen = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        seen.add(root);
        queue.add(root);

        while(!queue.isEmpty()){
            int node = queue.remove();
            int[] children = {leftChild[node],rightChild[node]};
            for(int child : children){
                if(child != -1){
                    if(seen.contains(child)){
                        return false;
                    }
                    queue.add(child);
                    seen.add(child);
                }
            }
        }
    return seen.size() == n;
    }

    int findRoot(int n, int[] leftChild, int[] rightChild){
        Set<Integer> children = new HashSet<>();
        for(int node : leftChild){
           children.add(node);
        }
        for(int node: rightChild){
            children.add(node);
        }

        for(int i=0; i<n; i++){
            if(!children.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
