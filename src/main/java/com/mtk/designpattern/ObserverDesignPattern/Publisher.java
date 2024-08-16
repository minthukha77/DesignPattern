package com.mtk.designpattern.ObserverDesignPattern;


public interface Publisher {
    void addSubscriber(Subscriber view1);
    void removeSubscriber(Subscriber sub);
    void notifySubscribers(String message);
}

