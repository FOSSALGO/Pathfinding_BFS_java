package pathfinding.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class PathfindingBFS {

    public static void main(String[] args) {
        int[][] maze = {
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2},
            {-1, 0, -1, 0, -1, -1, -1, -1, -1, -1, -1},
            {-1, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1},
            {-1, -1, -1, 0, -1, -1, -1, -1, 0, 0, -1},
            {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1},
            {-1, -1, -1, -1, -1, 0, 0, -1, 0, 0, -1},
            {-1, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1},
            {-1, 1, 0, 0, -1, -1, -1, -1, 0, 0, -1},
            {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
        };

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + ", ");
            }
            System.out.println("");
        }

        Queue<Posisi> queue = new LinkedList<>();
        Posisi start = new Posisi(8, 1);
        queue.add(start);
        
        while(!queue.isEmpty()){
            Posisi head = queue.poll();
            int io = head.I;
            int jo = head.J;
            int value = maze[io][jo];
            int nextValue = value + 1;
            
            //NORTH
            int i = io-1;
            int j = jo;
            if(i>=0 && i<maze.length && j>=0 && j< maze[io].length){
                if(maze[i][j]==-2){
                    System.out.println("Jumlah langkah = "+value);
                    System.out.println("FINISH");
                    break;
                }else if(maze[i][j]==0){
                    maze[i][j] = nextValue;
                    Posisi nextPosisi = new Posisi(i,j);
                    queue.add(nextPosisi);
                }
            }
            
            //EAST
            i = io;
            j = jo+1;
            if(i>=0 && i<maze.length && j>=0 && j< maze[io].length){
                if(maze[i][j]==-2){
                    System.out.println("Jumlah langkah = "+value);
                    System.out.println("FINISH");
                    break;
                }else if(maze[i][j]==0){
                    maze[i][j] = nextValue;
                    Posisi nextPosisi = new Posisi(i,j);
                    queue.add(nextPosisi);
                }
            }
                        
            //SOUTH
            i = io+1;
            j = jo;
            if(i>=0 && i<maze.length && j>=0 && j< maze[io].length){
                if(maze[i][j]==-2){
                    System.out.println("Jumlah langkah = "+value);
                    System.out.println("FINISH");
                    break;
                }else if(maze[i][j]==0){
                    maze[i][j] = nextValue;
                    Posisi nextPosisi = new Posisi(i,j);
                    queue.add(nextPosisi);
                }
            }
            
            //WEST
            i = io;
            j = jo-1;
            if(i>=0 && i<maze.length && j>=0 && j< maze[io].length){
                if(maze[i][j]==-2){
                    System.out.println("Jumlah langkah = "+value);
                    System.out.println("FINISH");
                    break;
                }else if(maze[i][j]==0){
                    maze[i][j] = nextValue;
                    Posisi nextPosisi = new Posisi(i,j);
                    queue.add(nextPosisi);
                }
            }                   
        }//end of while BFS
        
         for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + ", ");
            }
            System.out.println("");
        }

    }

}
