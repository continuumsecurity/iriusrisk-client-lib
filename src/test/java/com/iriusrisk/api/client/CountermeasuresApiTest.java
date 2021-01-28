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

import com.iriusrisk.api.client.model.AssociateCountermeasureThreatLibraryRequestBody;
import com.iriusrisk.api.client.model.AssociateCountermeasureWeaknessLibraryRequestBody;
import com.iriusrisk.api.client.model.ControlCommand;
import com.iriusrisk.api.client.model.Error;
import com.iriusrisk.api.client.model.LibraryControl;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CountermeasuresApi
 */
@Ignore
public class CountermeasuresApiTest {

    private final CountermeasuresApi api = new CountermeasuresApi();

    
    /**
     * Creates new countermeasure in a risk pattern
     *
     * Creates new countermeasure in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPostTest() {
        String apiToken = null;
        String libraryRef = null;
        String riskPatternRef = null;
        ControlCommand createCountermeasureLibraryRequestBody = null;
        LibraryControl response = api.librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost(apiToken, libraryRef, riskPatternRef, createCountermeasureLibraryRequestBody);

        // TODO: test validations
    }
    
    /**
     * Associates a countermeasure to a threat in a risk pattern.
     *
     * Associates a countermeasure to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPutTest() {
        String apiToken = null;
        String libraryRef = null;
        String riskPatternRef = null;
        String useCaseRef = null;
        String threatRef = null;
        AssociateCountermeasureThreatLibraryRequestBody associateCountermeasureThreatLibraryRequestBody = null;
        LibraryControl response = api.librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, associateCountermeasureThreatLibraryRequestBody);

        // TODO: test validations
    }
    
    /**
     * Associates a countermeasure to a weakness in a risk pattern.
     *
     * Associates a countermeasure to a weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPutTest() {
        String apiToken = null;
        String libraryRef = null;
        String riskPatternRef = null;
        String useCaseRef = null;
        String threatRef = null;
        String weaknessRef = null;
        AssociateCountermeasureWeaknessLibraryRequestBody associateCountermeasureWeaknessLibraryRequestBody = null;
        LibraryControl response = api.librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, weaknessRef, associateCountermeasureWeaknessLibraryRequestBody);

        // TODO: test validations
    }
    
}