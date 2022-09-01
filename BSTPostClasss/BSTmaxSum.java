package BSTPostClasss;

public class BSTmaxSum {


// Information about the class Node
class TreeNode{
    public int val;
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        left=null;
        right=null;

    }
}

    public int maxSumBST(TreeNode root) {
        int ans = helper(root).currmax;
        return ans > 0 ? ans : 0;
    }
    public Val helper(TreeNode root)
    {
        if(root==null)
            return new Val(Integer.MAX_VALUE,Integer.MIN_VALUE,0,true,0);

        if(root.left==null && root.right==null)
            return new Val(root.val,root.val,root.val,true,root.val);

        Val l = helper(root.left);
        Val r = helper(root.right);

        Val curr = new Val();

        if(l.isBST && r.isBST && l.max < root.val && r.min > root.val)
        {
            curr.min = Math.min(l.min,root.val);
            curr.max = Math.max(r.max,root.val);
            curr.sum = root.val + l.sum + r.sum;
            curr.isBST = true;
            curr.currmax = Math.max(Math.max(l.currmax,r.currmax),curr.sum);
            return curr;
        }

        curr.min = Math.min(root.val,Math.min(l.min,r.min));
        curr.max = Math.max(root.val,Math.max(l.max,r.max));
        curr.sum = Integer.MIN_VALUE;
        curr.isBST = false;
        curr.currmax = Math.max(l.currmax,r.currmax);

        return curr;
    }
}
class Val{
    int min;
    int max;
    int sum;
    boolean isBST;
    int currmax;
    public Val(int mi,int ma,int s,boolean ibt,int curr)
    {
        min = mi;
        max = ma;
        sum = s;
        isBST = ibt;
        currmax = curr;
    }
    public Val()
    {

    }
}


