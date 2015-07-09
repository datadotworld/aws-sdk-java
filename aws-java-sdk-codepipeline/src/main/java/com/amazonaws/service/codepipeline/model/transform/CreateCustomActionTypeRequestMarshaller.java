/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.service.codepipeline.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.service.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CreateCustomActionTypeRequest Marshaller
 */
public class CreateCustomActionTypeRequestMarshaller
        implements
        Marshaller<Request<CreateCustomActionTypeRequest>, CreateCustomActionTypeRequest> {

    public Request<CreateCustomActionTypeRequest> marshall(
            CreateCustomActionTypeRequest createCustomActionTypeRequest) {

        if (createCustomActionTypeRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateCustomActionTypeRequest> request = new DefaultRequest<CreateCustomActionTypeRequest>(
                createCustomActionTypeRequest, "AWSCodePipeline");
        request.addHeader("X-Amz-Target",
                "CodePipeline_20150709.CreateCustomActionType");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (createCustomActionTypeRequest.getCategory() != null) {
                jsonWriter.key("category").value(
                        createCustomActionTypeRequest.getCategory());
            }

            if (createCustomActionTypeRequest.getProvider() != null) {
                jsonWriter.key("provider").value(
                        createCustomActionTypeRequest.getProvider());
            }

            if (createCustomActionTypeRequest.getVersion() != null) {
                jsonWriter.key("version").value(
                        createCustomActionTypeRequest.getVersion());
            }

            if (createCustomActionTypeRequest.getSettings() != null) {
                jsonWriter.key("settings");
                ActionTypeSettingsJsonMarshaller.getInstance()
                        .marshall(createCustomActionTypeRequest.getSettings(),
                                jsonWriter);
            }

            java.util.List<ActionConfigurationProperty> configurationPropertiesList = createCustomActionTypeRequest
                    .getConfigurationProperties();
            if (configurationPropertiesList != null) {
                jsonWriter.key("configurationProperties");
                jsonWriter.array();
                for (ActionConfigurationProperty configurationPropertiesListValue : configurationPropertiesList) {
                    if (configurationPropertiesListValue != null) {

                        ActionConfigurationPropertyJsonMarshaller.getInstance()
                                .marshall(configurationPropertiesListValue,
                                        jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (createCustomActionTypeRequest.getInputArtifactDetails() != null) {
                jsonWriter.key("inputArtifactDetails");
                ArtifactDetailsJsonMarshaller
                        .getInstance()
                        .marshall(
                                createCustomActionTypeRequest
                                        .getInputArtifactDetails(),
                                jsonWriter);
            }

            if (createCustomActionTypeRequest.getOutputArtifactDetails() != null) {
                jsonWriter.key("outputArtifactDetails");
                ArtifactDetailsJsonMarshaller
                        .getInstance()
                        .marshall(
                                createCustomActionTypeRequest
                                        .getOutputArtifactDetails(),
                                jsonWriter);
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}