package com.kursach1.controllers;

import com.kursach1.domains.Creative;
import com.kursach1.services.CreativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value ="/api/creative")
public class CreativeController {
    @Autowired
    private CreativeService creativeService;

    @RequestMapping(value = "/getByUserId",method = RequestMethod.GET)
    public Collection<Creative> getById(@RequestParam Integer userId) {
        return creativeService.getByUserId(userId);
    }
    @RequestMapping(value = "/getByCreativeId",method = RequestMethod.GET)
    public Collection<Creative> getByCreativeId(@RequestParam Integer count,@RequestParam Integer creativeId) {
        return creativeService.getByCreativeId(creativeId,count);
    }
    @RequestMapping(value = "/getCreativeById",method = RequestMethod.GET)
    public Creative getCreativeById(@RequestParam Integer creativeId) {
        return creativeService.getCreativeById(creativeId);
    }
}
