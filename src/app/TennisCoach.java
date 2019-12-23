package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {


    private  FortuneService fortuneService;

    public TennisCoach()
    {
        System.out.println("Tennis Coach: Inside default constructor");
    }

    /*
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Tennis Coach: Inside setter function");
        this.fortuneService = fortuneService;
    }
    */


    // Construvctor injection
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
