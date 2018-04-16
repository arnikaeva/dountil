package com.greenfoxacademy.rest.controller;

import com.greenfoxacademy.rest.model.DoUntilRequest;
import com.greenfoxacademy.rest.model.ErrorMessage;
import com.greenfoxacademy.rest.service.DoUntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilController {

  @Autowired
  private DoUntilService doUntilService;

  @PostMapping("/dountil/{what}")
  public Object doUntil(@RequestBody(required = false) DoUntilRequest doUntilRequest, @PathVariable(name = "what" ) String actionName) {
    if (doUntilRequest == null) {
      return new ErrorMessage("Please provide a number!");
    } else {
      return doUntilService.handleRequest(doUntilRequest, actionName);
    }
  }
}
