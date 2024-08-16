package com.mtk.designpattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Model implements Publisher{

    List<Subscriber> subscribers = new  ArrayList<Subscriber>();
    @Override
    public void addSubscriber(Subscriber sub) {
        this.subscribers.add(sub);
    }

    @Override
    public void removeSubscriber(Subscriber sub) {
        this.subscribers.remove(sub);
    }

    @Override
    public void notifySubscribers(String message) {
        System.out.println("Notify subscriber "+message);
        for(Subscriber sub: this.subscribers)
        {
            sub.update(message);
        }
    }
    
}
