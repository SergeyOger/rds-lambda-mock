package com.mock.rdslambdamock.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organization")
@Slf4j
public class DashboardController {

  @GetMapping("/{id}")
  public Object getOrganizationReport(@PathVariable String id)
      throws IOException {
    log.info("Creating report for: {}", id);
    File response = new File(
        getClass().getClassLoader().getResource("response.json")
            .getFile());
    return new ObjectMapper().readValue(response, Map.class);
  }
}
