package com.spicy.chiken.wings;

public class Restaurant
{
    String name;
    boolean isOpen;
    boolean doTakeaway;

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isOpen()
    {
        return isOpen;
    }

    public void setOpen(boolean open)
    {
        isOpen = open;
    }

    public boolean isDoTakeaway()
    {
        return doTakeaway;
    }

    public void setDoTakeaway(boolean doTakeaway)
    {
        this.doTakeaway = doTakeaway;
    }
}
