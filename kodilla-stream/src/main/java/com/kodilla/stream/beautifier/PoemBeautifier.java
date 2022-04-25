package com.kodilla.stream.beautifier;

public class PoemBeautifier  {


    public String decorate(String text){
        return text;
    }

    public void beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println("this is result of my modification: " + result);
    }

}
