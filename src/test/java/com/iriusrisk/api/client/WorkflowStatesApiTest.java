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
import com.iriusrisk.api.client.model.WorkflowState;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowStatesApi
 */
@Ignore
public class WorkflowStatesApiTest {

    private final WorkflowStatesApi api = new WorkflowStatesApi();

    
    /**
     * List of all Workflow states.
     *
     * Returns a list of all the workflow states. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowstatesGetTest() {
        String apiToken = null;
        List<WorkflowState> response = api.workflowstatesGet(apiToken);

        // TODO: test validations
    }
    
}