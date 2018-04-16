package com.greenfoxacademy.rest.model.v2;

public class DoUntil {

  private int until;
  private int result;
  private String error;


  public void factorial() {
    int factorial = 1;

    for(int i = 1; i <= until; i++) {
      factorial *= i;
    }

    this.result = factorial;
  }

  public void sum() {
    int sum = 0;

    for(int i = 1; i <= until; i++) {
      sum += i;
    }

    this.result = sum;
  }

  //needed so the request will contain 'until' data
  public int getUntil() {
    return until;
  }

  //needed so the response will contain 'result' data
  public int getResult() {
    return result;
  }

  //needed so the response will contain 'error' data
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
