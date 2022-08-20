package com.epam.rd.autotasks;

public class CarouselWithLimitedRun extends CarouselRun {

    private int actionLimit; //обмеження на кільксть ранів

    public CarouselWithLimitedRun(DecrementingCarousel dec, final int actionLimit) {
        super(dec);
        this.actionLimit = actionLimit;
    }
    public int next() {
        int passesNumber = 0;
        int listElement;
        do {
            if(passesNumber > dec.carosel.length) return -1;
            if(runnerIndex == dec.carosel.length) runnerIndex = 0;

            listElement = dec.carosel[runnerIndex];

            runnerIndex++;
            passesNumber++;

        } while (listElement == 0);

        if(actionLimit<=0) return -1;
        actionLimit--;

        dec.carosel[runnerIndex-1] -= 1;
        //System.out.println("Current = " + listElement + " Current changed - " + dec.carosel[runnerIndex-1]);
        return listElement;
    }

    private int elementsCount()
    {
        int counter = 0;
        for(int i = 0; i < dec.carosel.length; i++)
        {
            if(dec.carosel[i] > 0) counter++;
        }
        return counter;
    }
    public boolean isFinished() {

        if(elementsCount() == 0 || actionLimit<=0) return true;
        else return false;
    }

}
