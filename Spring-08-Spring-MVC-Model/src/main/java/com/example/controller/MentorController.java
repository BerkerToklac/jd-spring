package com.example.controller;

import com.example.model.Gender;
import com.example.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @RequestMapping("/list") //Localhost:8080/mentor/list
    public String mentor(Model model){
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor(45,"Mike","Smith", Gender.MALE));
        mentorList.add(new Mentor(65,"Tom","Hanks", Gender.MALE));
        mentorList.add(new Mentor(25,"Ammy","Bryan", Gender.FEMALE));
        model.addAttribute("mentors",mentorList);
        return "mentor/mentor-list";
    }
}
