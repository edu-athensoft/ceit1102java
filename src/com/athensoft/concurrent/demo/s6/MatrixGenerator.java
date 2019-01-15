package com.athensoft.concurrent.demo.s6;

import java.util.Random;
public class MatrixGenerator{

    public static int[][] getMatrix(){
        Random random=new Random();
        int rand=0;//存储随机数
        int[][] arrays=new int[10][200];//声明二维数组
        //给数组赋值
        for(int i=0;i<arrays.length;i++){
            for(int j=0;j<arrays[i].length;j++){
                rand=random.nextInt(1000);//在0-100内随机生成一个正整数
                arrays[i][j]=rand;
            }
        }
        return arrays;
    }

    public static void printMatrix(int[][] arrays){
        System.out.println();//换行
        System.out.println("采用for循环: ");
        for(int[] a:arrays){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}

