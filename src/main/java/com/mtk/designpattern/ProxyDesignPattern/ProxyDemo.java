package com.mtk.designpattern.ProxyDesignPattern;

public class ProxyDemo {
    public static void main(String[] args) throws Exception {
        CommandExecutor command = new CommandExecutorProxy("admin", "admin");
        command.runCommand("notepad.exe");
        
        command = new CommandExecutorProxy("user", "user");
        command.runCommand("rm");
        
    }
    
}
