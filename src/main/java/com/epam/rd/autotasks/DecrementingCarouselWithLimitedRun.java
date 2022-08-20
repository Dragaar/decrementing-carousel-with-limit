package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    final int actionLimit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.actionLimit = actionLimit;
    }

    public CarouselRun run(){
        if(isCaruselRynUnique) {
            CarouselRun rynner = new CarouselWithLimitedRun(this, actionLimit);
            isCaruselRynUnique = false;
            return rynner;
        } else return null;
    }
}
