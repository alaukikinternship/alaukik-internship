package com.multithreading;
import java.io.*;
public class Main
{
    public static void main(String args[])
    {
   
    FileTask fileTask1=new FileTask("files/file1.txt");
    FileTask fileTask2=new FileTask("files/file2.txt");
    FileTask fileTask3=new FileTask("files/file3.txt");
    
    Thread t1=new Thread(fileTask1);
    Thread t2=new Thread(fileTask2);
    Thread t3=new Thread(fileTask3);
    t1.start();
    t2.start();
    t3.start();
    }

}
