package com.iriusrisk.api.client;

import com.iriusrisk.api.client.invoker.ApiClient;

import com.iriusrisk.api.client.model.Error;
import java.io.File;
import com.iriusrisk.api.client.model.ProductShort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T08:48:15.539+01:00")
@Component("com.iriusrisk.api.client.TemplatesApi")
public class TemplatesApi {
    private ApiClient apiClient;

    public TemplatesApi() {
        this(new ApiClient());
    }

    @Autowired
    public TemplatesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a new product, library or template from a XML file upload.
     * Creates a new product, library or template from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_CREATE** granted allows to create a product. - To have the permission **LIBRARY_UPDATE** granted allows to create a library. - To have the permission **TEMPLATE_UPDATE** granted allows to create a template. 
     * <p><b>201</b> - Product details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Product ref (required)
     * @param name Product name (required)
     * @param fileName File to upload in XML format (required)
     * @param type Product type - STANDARD (By default), TEMPLATE or LIBRARY (optional)
     * @return ProductShort
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProductShort productsUploadPost(String apiToken, String ref, String name, File fileName, String type) throws RestClientException {
        return productsUploadPostWithHttpInfo(apiToken, ref, name, fileName, type).getBody();
    }

    /**
     * Creates a new product, library or template from a XML file upload.
     * Creates a new product, library or template from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_CREATE** granted allows to create a product. - To have the permission **LIBRARY_UPDATE** granted allows to create a library. - To have the permission **TEMPLATE_UPDATE** granted allows to create a template. 
     * <p><b>201</b> - Product details
     * <p><b>403</b> - API is not enabled
     * <p><b>0</b> - Unexpected error
     * @param apiToken Authentication token (required)
     * @param ref Product ref (required)
     * @param name Product name (required)
     * @param fileName File to upload in XML format (required)
     * @param type Product type - STANDARD (By default), TEMPLATE or LIBRARY (optional)
     * @return ResponseEntity&lt;ProductShort&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProductShort> productsUploadPostWithHttpInfo(String apiToken, String ref, String name, File fileName, String type) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'apiToken' is set
        if (apiToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiToken' when calling productsUploadPost");
        }
        
        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ref' when calling productsUploadPost");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling productsUploadPost");
        }
        
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileName' when calling productsUploadPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/products/upload").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiToken != null)
        headerParams.add("api-token", apiClient.parameterToString(apiToken));

        if (ref != null)
            formParams.add("ref", ref);
        if (name != null)
            formParams.add("name", name);
        if (type != null)
            formParams.add("type", type);
        if (fileName != null)
            formParams.add("fileName", new FileSystemResource(fileName));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ProductShort> returnType = new ParameterizedTypeReference<ProductShort>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}