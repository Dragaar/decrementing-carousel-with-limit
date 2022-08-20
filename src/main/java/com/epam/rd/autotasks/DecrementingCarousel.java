package com.epam.rd.autotasks;

public class DecrementingCarousel {
    protected int[] carosel;
    private int index = 0;
    protected boolean isCaruselRynUnique = true;

    public DecrementingCarousel(int capacity) {
        carosel = new int[capacity];
    }

    public boolean addElement(int element){
        if(element <= 0) return false;

        if(isCaruselRynUnique && index<carosel.length) {
            carosel[index] = element;
            index++;
            return true;
        } else return false;
    }

    public CarouselRun run(){
        if(isCaruselRynUnique) {
            CarouselRun rynner = new CarouselRun(this);
            isCaruselRynUnique = false;
            return rynner;
        } else return null;
    }
}
