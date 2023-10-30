package com.example.demo;

interface xeInterface
{
    public void PrintXe();
}

class xeMay implements xeInterface
{
    @Override
    public void PrintXe()
    {
        System.out.println("Xe May");
    }
}

class xeDap implements xeInterface
{
    @Override
    public void PrintXe()
    {
        System.out.println("Xe Dap");
    }
}

public class xe
{
    public static void main(String[] args)
    {
        xeInterface xeVar = new xeMay();
        xeVar.PrintXe();
    }
}
