package com.usa.spending.services;

import com.usa.spending.models.StateListing;
import com.usa.spending.models.StateOverview;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;
import java.util.ArrayList;

@Service
public class StateAwardService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String STATE_SEARCH = "https://api.usaspending.gov/api/v2/recipient/state/";
    private final String STATE_DETAIL = "https://api.usaspending.gov/api/v2/recipient/state/{0}/";

    public StateAwardService() {
    }

    /**
     * Get all basic spending information for each state.
     * @return Array of StateListing objects
     */
    public StateListing[] getAll() {
        System.out.println("Fetching all state spending overview from: URL=" + STATE_SEARCH);
        return this.restTemplate.getForObject(STATE_SEARCH, StateListing[].class);
    }

    // TODO #1 -- Get all basic spending information for each state, ordered by "amount".
    public ArrayList<StateListing> getAllSorted() {
        return null;
    }

    // TODO #2 -- Get all awards for a specific state by FIPS code
    public StateOverview getForStateByFips(String fips) {
        String url = MessageFormat.format(this.STATE_DETAIL, fips);
        System.out.println("Fetching state spending detail from: URL=" + url + ", fips=" + fips);
        return null;
    }

    // TODO #5 -- Get all awards for a specific state by abbreviation
    //  Unfortunately, the public API does not have an endpoint for this directly
    public StateOverview getForStateCode(String code) {
        return null;
    }
}
