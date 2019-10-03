package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * 遍历顺序存储的二叉树
 *
 * @Author lyr
 * @create 2019/10/3 9:13
 */
public class Print {
    public static void main(String[] args) {
        postOrder();
    }

    public static void preOrder()
    {
        int[] arr = {5,3,7,2,4,6,8};

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        while(!stack.isEmpty())
        {
            int cur = stack.pop();
            System.out.print(arr[cur]+" ");

            int right = cur*2+2;
            int left = cur*2 + 1;
            if(right<arr.length)
            {
                stack.push(right);
            }
            if(left<arr.length)
            {
                stack.push(left);
            }
        }



    }
    public static void preorder2()
    {
        int[] arr = {5,3,7,2,4,6,8};

        Stack<Integer> stack = new Stack<Integer>();
        int i=0;
        while((!stack.isEmpty())||i<arr.length)
        {
            while(i<arr.length)
            {
                System.out.println(arr[i]);
                stack.push(i);
                i=i*2+1;
            }
            if(!stack.isEmpty())
            {
                i=stack.pop();
                i=i*2+2;
            }
        }
    }


    public static void InOrder()
    {
        int[] arr = {5,3,7,2,4,6,8};


        Stack<Integer> stack = new Stack<Integer>();

        int i=0;
        while(!stack.isEmpty()||i<arr.length)
        {
            while (i<arr.length)
            {

                stack.push(i);
                i = i*2+1;
            }


            if(!stack.isEmpty())
            {
                i = stack.pop();
                System.out.println(arr[i]);
                i = i*2+2;
            }

        }



    }


    public static void postOrder()
    {
        // 因为在后序遍历中，要保证左孩子和右孩子都已被访问并且左孩子在右孩子前访问才能访问根结点
        int[] arr = {5,3,7,2,4,6,8};
        LinkedList<Integer> deque = new LinkedList();
       LinkedList<Integer> ans = new LinkedList();
        deque.addLast(0);
        while (deque.size()!=0)
        {
            int i = deque.pollLast();
            ans.addFirst(arr[i]);
            int l = i*2+1;
            int r = l+1;
            if(l<arr.length)
            {
                deque.add(l);
            }
            if(r<arr.length)
            {
                deque.add(r);
            }
        }
        for (Integer i : ans) {
            System.out.print(i+" ");
        }


    }
















}

