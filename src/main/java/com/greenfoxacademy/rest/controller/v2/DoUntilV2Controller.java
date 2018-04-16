package com.greenfoxacademy.rest.controller.v2;

import com.greenfoxacademy.rest.model.v2.DoUntil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilV2Controller {


  @PostMapping("/dountil/v2/{what}")
  public Object doUntilV2(@RequestBody(required = false) DoUntil doUntil, @PathVariable String what) {
    if (doUntil == null) {
      doUntil = new DoUntil();
      doUntil.setError("Please provide a number!");

    } else if ("sum".equals(what)) {
      doUntil.sum();

    } else if ("factor".equals(what)) {
      doUntil.factorial();

    }

    return doUntil;
  }
}
