package com.mtk.designpattern.FlyweightDesignPattern;

public class DotNetPlatForm implements Platform {

    public void DotNetPlatform() {
        System.out.println("Create .net platform");
    }

    
    @Override
    public void execute(Code code) {
        System.out.println("Execute Code "+code.getCode()+" on DotNet ");
    }
    
}

