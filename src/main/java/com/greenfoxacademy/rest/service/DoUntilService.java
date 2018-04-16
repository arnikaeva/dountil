package com.greenfoxacademy.rest.service;

import com.greenfoxacademy.rest.model.DoUntilRequest;
import com.greenfoxacademy.rest.model.DoUntilResponse;
import org.springframework.stereotype.Service;

@Service
public class DoUntilService {

  private static final String ACTION_SUM = "sum";
  private static final String ACTION_FACTOR = "factor";


  public DoUntilResponse handleRequest(DoUntilRequest doUntilRequest, String actionName) {
    if (ACTION_SUM.equals(actionName)) {
      return handleSumRequest(doUntilRequest);

    } else if (ACTION_FACTOR.equals(actionName)) {
      return handleFactorialRequest(doUntilRequest);

    } else {
      throw new RuntimeException("Unknown action: " + actionName);
    }
  }

  private DoUntilResponse handleFactorialRequest(DoUntilRequest doUntilRequest) {
    int result = 1;

    for(int i = 1; i <= doUntilRequest.getUntil(); i++) {
      result *= i;
    }

    return new DoUntilResponse(result);
  }

  private DoUntilResponse handleSumRequest(DoUntilRequest doUntilRequest) {
    int result = 0;

    for(int i = 1; i <= doUntilRequest.getUntil(); i++) {
      result += i;
    }

    return new DoUntilResponse(result);
  }
}
