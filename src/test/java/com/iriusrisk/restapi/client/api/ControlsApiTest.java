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


package com.iriusrisk.restapi.client.api;

import com.iriusrisk.restapi.client.ApiException;
import com.iriusrisk.restapi.client.model.ComponentControl;
import com.iriusrisk.restapi.client.model.Error;
import com.iriusrisk.restapi.client.model.UpdateStatusCountermeasureRequestBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ControlsApi
 */
@Ignore
public class ControlsApiTest {

    private final ControlsApi api = new ControlsApi();

    
    /**
     * Sets the desired status to a countermeasure
     *
     * Sets the desired status to a countermeasure. Possible values are:             - implemented             - recommended             - rejected             - required Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_UPDATE** granted to set any state.   - To have the permission **COUNTERMEASURE_SELECT_IMPLEMENTED** granted to set implemented state.   - To have the permission **COUNTERMEASURE_SELECT_RECOMMENDED** granted to set recommended state.   - To have the permission **COUNTERMEASURE_SELECT_REJECTED** granted to set reject state.   - To have the permission **COUNTERMEASURE_SELECT_REQUIRED** granted to set required state. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productsRefComponentsComponentRefControlsControlRefStatusPutTest() throws ApiException {
        String apiToken = null;
        String ref = null;
        String componentRef = null;
        String controlRef = null;
        UpdateStatusCountermeasureRequestBody updateStatusCountermeasureRequestBody = null;
        api.productsRefComponentsComponentRefControlsControlRefStatusPut(apiToken, ref, componentRef, controlRef, updateStatusCountermeasureRequestBody);

        // TODO: test validations
    }
    
    /**
     * Gets a list of all product countermeasures
     *
     * Returns a list of all the countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productsRefControlsGetTest() throws ApiException {
        String apiToken = null;
        String ref = null;
        List<ComponentControl> response = api.productsRefControlsGet(apiToken, ref);

        // TODO: test validations
    }
    
    /**
     * Gets a list of all implemented countermeasures of a product.
     *
     * Returns a list of all the implemented countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productsRefControlsImplementedGetTest() throws ApiException {
        String apiToken = null;
        String ref = null;
        List<ComponentControl> response = api.productsRefControlsImplementedGet(apiToken, ref);

        // TODO: test validations
    }
    
    /**
     * Gets a list of all required countermeasures of a product
     *
     * Returns a list of all the required countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void productsRefControlsRequiredGetTest() throws ApiException {
        String apiToken = null;
        String ref = null;
        List<ComponentControl> response = api.productsRefControlsRequiredGet(apiToken, ref);

        // TODO: test validations
    }
    
}