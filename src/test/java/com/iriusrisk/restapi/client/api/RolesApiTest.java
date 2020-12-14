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
import com.iriusrisk.restapi.client.model.CreateRoleRequestBody;
import com.iriusrisk.restapi.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RolesApi
 */
@Ignore
public class RolesApiTest {

    private final RolesApi api = new RolesApi();

    
    /**
     * Creates a new Role
     *
     * Creates a new role. Conditions to be able to perform the action:  - To have the permission **ROLES_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rolesPostTest() throws ApiException {
        String apiToken = null;
        CreateRoleRequestBody createRoleRequestBody = null;
        api.rolesPost(apiToken, createRoleRequestBody);

        // TODO: test validations
    }
    
    /**
     * Deletes an existing role
     *
     * Deletes an existing role. Conditions to be able to perform the action: - To have the permission **ROLES_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rolesRoleNameDeleteTest() throws ApiException {
        String apiToken = null;
        String roleName = null;
        api.rolesRoleNameDelete(apiToken, roleName);

        // TODO: test validations
    }
    
}
