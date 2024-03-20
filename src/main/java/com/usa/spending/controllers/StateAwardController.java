package com.usa.spending.controllers;

import com.usa.spending.models.StateListing;
import com.usa.spending.models.StateOverview;
import com.usa.spending.services.StateAwardService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/recipient/state")
public class StateAwardController {
    private final StateAwardService stateAwardService;

    public StateAwardController(StateAwardService stateAwardService) {
        this.stateAwardService = stateAwardService;
    }

    @GetMapping("/all")
    @Operation(summary = "Get all basic spending information for each state")
    public ResponseEntity<StateListing[]> getAll() {
        return new ResponseEntity<>(this.stateAwardService.getAll(), HttpStatus.OK);
    }

    // TODO #3 -- Get all detailed spending information for each state
    /*
    @GetMapping("/{fips}")
    @Operation(summary = "Get detailed spending information for specific state by FIPS code")
    public ResponseEntity<StateOverview> getDetail(@PathVariable String fips) {
        return new ResponseEntity<>(this.stateAwardService.getForStateByFips(fips), HttpStatus.OK);
    }
    */

    // TODO #4 -- Get all awards for a specific state by state code

    // TODO #6 -- Implement a POST request to perform advanced querying/filtering of data
    //  -- consult documentation (https://api.usaspending.gov/docs/endpoints) for information on the /api/v2/search/... functionality
}
