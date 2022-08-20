package com.example.demo;

public class BaseBall implements Coach{

    //define a private field for dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection

    public BaseBall(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getdetailWorkout() {
        return "Do 100 jumps in 5 minutes";
    }

    @Override
    public String getDailyFortune() {
        //use my fortune service to get a fortune
        return fortuneService.getFortune();
    }
}
