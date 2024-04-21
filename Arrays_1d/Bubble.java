package Arrays_1d;

import java.lang.*;
import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int maze[][] = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                maze[i][j] = scan.nextInt();
            }
        }

        int sri = scan.nextInt();
        int sci = scan.nextInt();

        int eri = scan.nextInt();
        int eci = scan.nextInt();

        if(sri==eri && sci==eci)
        {
            System.out.println(0);
        }

        int x[] = {-1,1,0};
        int y[] = {-1,1,0};

        int result = Integer.MAX_VALUE;
        int lr = -1;
        int count2 =0;

        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                if(Math.abs(x[i])!=Math.abs(x[j])){
                    int rx= sri+x[i];
                    int ry= sci+y[j];
                    if(rx<row && rx>=0 && ry<col && ry>=0){

                        if(maze[rx][ry]!=-1 && maze[rx][ry]!=1 && maze[rx][ry]!=3){

                            int c2 = count2;
                            if(maze[rx][ry]==2){
                                c2=count2+1;
                            }
                            int ov = maze[sri][sci];
                            maze[sri][sci] = -1;
                            lr = pathLen(rx,ry,eri,eci,maze,c2,row,col);
                            maze[sri][sci]=ov;
                            if(lr!=-1 && lr<result){
                                result=lr+1;
                            }
                        }
                    }
                }
            }
        }

        if(result==Integer.MAX_VALUE){
            for(int i=0;i<x.length;i++){
                for(int j=0;j<y.length;j++){
                    if(Math.abs(x[i])!=Math.abs(x[j])){
                        int rx= sri+x[i];
                        int ry= sci+y[j];
                        if(rx<row && rx>=0 && ry<col && ry>=0){

                            if(maze[rx][ry]==3){

                                int c2 = count2;
                                int ov = maze[sri][sci];
                                maze[sri][sci] = -1;
                                lr = pathLen(rx,ry,eri,eci,maze,c2,row,col);
                                maze[sri][sci]=ov;
                                if(lr!=-1 && lr<result){
                                    result=lr+1;
                                }
                            }
                        }
                    }
                }
            }
        }

        if(result==Integer.MAX_VALUE){
            System.out.println("STUCK");
        }
        else
        {
            System.out.println(result);
        }
    }

    static int pathLen(int sri, int sci, int eri, int eci, int maze[][], int count2, int row,int col){
        if(count2>2){
            return -1;
        }
        else if(sri==eri && sci==eci) {
            return 0;
        }

        int x[] = {-1,1,0};
        int y[] = {-1,1,0};

        int result = Integer.MAX_VALUE;

        int lr = -1;
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                if(Math.abs(x[i])!=Math.abs(x[j])){
                    int rx= sri+x[i];
                    int ry= sci+y[j];
                    if(rx<row && rx>=0 && ry<col && ry>=0){
                        if(maze[rx][ry]!=-1 && maze[rx][ry]!=1 && maze[rx][ry]!=3){
                            int c2 = count2;
                            if(maze[rx][ry]==2){
                                c2=count2+1;
                            }
                            int ov = maze[sri][sci];
                            maze[sri][sci] = -1;
                            lr = pathLen(rx,ry,eri,eci,maze,c2,row,col);
                            maze[sri][sci]=ov;
                            if(lr!=-1 && lr<result){
                                result=lr+1;
                            }
                        }
                    }
                }
            }
        }

        if(result==Integer.MAX_VALUE){
            for(int i=0;i<x.length;i++){
                for(int j=0;j<y.length;j++){
                    if(Math.abs(x[i])!=Math.abs(x[j])){
                        int rx= sri+x[i];
                        int ry= sci+y[j];
                        if(rx<row && rx>=0 && ry<col && ry>=0){

                            if(maze[rx][ry]==3){

                                int c2 = count2;
                                int ov = maze[sri][sci];
                                maze[sri][sci] = -1;
                                lr = pathLen(rx,ry,eri,eci,maze,c2,row,col);
                                maze[sri][sci]=ov;
                                if(lr!=-1 && lr<result){
                                    result=lr+1;
                                }
                            }
                        }
                    }
                }
            }
        }

        if(result!=Integer.MAX_VALUE)
            return result;
        else
            return -1;
    }
}