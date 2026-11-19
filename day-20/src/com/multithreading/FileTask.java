package com.multithreading;
import java.io.*;
public class FileTask implements Runnable
{
    private String filename;
    public FileTask(String filename)
    {
        this.filename=filename;
    }
    public void run()
    {
        try
        {
BufferedReader br=new BufferedReader(new FileReader(filename));
String line;
int count=0;
while((line=br.readLine())!=null)count++;

br.close();
    System.out.println(filename+" Lines"+count);
        }catch(IOException ioException)
        {
            System.out.println(ioException.getMessage());
        }
}
}