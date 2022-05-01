package com.itheima;

public class HelloSpring {
    private String username;
    public void setUsername(String username){
        this.username = username;
    }
    public void show(){
        System.out.println(username+":欢迎来到Spring");
    }
}
