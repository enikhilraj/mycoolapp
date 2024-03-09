package edu.nick.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject property coach.name
    @Value("${coach.name}")
    // assign the value to the field coachName
    private String coachName;

    // inject property team.name
    @Value("${team.name}")
    // assign to the field teamName
    private String teamName;

    // expose new endpoint called "teaminfo" which will return coach name and team name
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
            return "Hello World!";
    }

    // expose a "/workout" endpoint which returns a string "Run a hard 5k!"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    //expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}
