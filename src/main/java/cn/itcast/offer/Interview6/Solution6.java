package cn.itcast.offer.Interview6;

import java.util.Arrays;

/**
 * Created by Yafei Zhang
 * on 2018-12-08 19:12
 */
public class Solution6 {
    public static BinaryTreeNode reConstructBinaryTree(int[] preorder, int[] inorder){
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length){
            return null;
        }
        //二叉树根节点
        BinaryTreeNode root = new BinaryTreeNode(preorder[0]);
        root.setLeft(null);
        root.setRight(null);

        //左子树的个数
        int leftNum = 0;
        for (int i = 0; i < inorder.length; i++){
            if (root.getVal() == inorder[i]){
                break;
            }else {
                leftNum++;
            }
        }

        //右子树的个数
        int rightNum = inorder.length - 1 - leftNum;

        //重建左子树
        if (leftNum > 0){
            //左子树的先序序列
            int[] leftPreorder = new int[leftNum];
            //左子树的中序序列
            int[] leftInorder = new int[leftNum];
            for (int i = 0; i < leftNum; i++){
                leftPreorder[i] = preorder[i + 1];
                leftInorder[i] = inorder[i];
            }
            BinaryTreeNode leftRoot = reConstructBinaryTree(leftPreorder, leftInorder);
            root.setLeft(leftRoot);
        }

        //重建右子树
        if (rightNum > 0){
            //右子树的先序序列
            int[] rightPreorder = new int[rightNum];
            //右子树的中序序列
            int[] rightInorder = new int[rightNum];
            for (int i = 0; i < rightNum; i++){
                rightPreorder[i] = preorder[leftNum + 1 + i];
                rightInorder[i] = inorder[leftNum + 1 + i];
            }
            BinaryTreeNode rightRoot = reConstructBinaryTree(rightPreorder, rightInorder);
            root.setRight(rightRoot);
        }
        return root;
    }

    public static void printPostOrder(BinaryTreeNode root){
        if (root != null){
            printPostOrder(root.getLeft());
            printPostOrder(root.getRight());
            System.out.println(root.getVal());
        }
    }

    public static void main(String[] args) {
        int[] preorder = {1,2,4,7,3,5,6,8};
        int[] inorder = {4,7,2,1,5,3,8,6};
        BinaryTreeNode root = reConstructBinaryTree(preorder, inorder);
        printPostOrder(root);
    }
}

class BinaryTreeNode{
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int x){ val = x;}

    public BinaryTreeNode getLeft() {
        return left;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}