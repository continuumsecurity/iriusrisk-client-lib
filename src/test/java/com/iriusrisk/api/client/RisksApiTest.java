/*
 * IriusRisk API
 * Products API
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.iriusrisk.api.client;

import com.iriusrisk.api.client.model.Error;
import com.iriusrisk.api.client.model.RiskSummary;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RisksApi
 */
@Ignore
public class RisksApiTest {

    private final RisksApi api = new RisksApi();

    
    /**
     * Gets the risks summary of a product
     *
     * This endpoint returns a summary of the risks of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productsRefRisksGetTest() {
        String apiToken = null;
        String ref = null;
        RiskSummary response = api.productsRefRisksGet(apiToken, ref);

        // TODO: test validations
    }
    
}