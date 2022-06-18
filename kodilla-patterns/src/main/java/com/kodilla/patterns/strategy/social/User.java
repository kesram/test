package com.kodilla.patterns.strategy.social;

public class User {

    private final String name;
    protected SocialPublisher socialPublisher;

    public User(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String sharePost(){
        return socialPublisher.Share();
    }

    public void setNewPublisher(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
