package com.example.demo;

public class Teniss implements Coach{

    private FortuneService fortuneService;

    public Teniss(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getdetailWorkout() {
        return "Do splashes";
    }

    @Override
    public String getDailyFortune() {
        //use my fortune service to get a fortune
        return "Just Do It: "+fortuneService.getFortune();
    }
}
