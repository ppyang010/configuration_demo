package com.example.demo.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {
 
  @Override
  public void onApplicationEvent(ApplicationFailedEvent applicationFailedEvent) {
    System.out.println("============>>>>> ApplicationFailedEvent is trigged");
  }
}