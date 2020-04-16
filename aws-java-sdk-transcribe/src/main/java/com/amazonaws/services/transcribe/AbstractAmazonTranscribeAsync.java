/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.transcribe;

import javax.annotation.Generated;

import com.amazonaws.services.transcribe.model.*;

/**
 * Abstract implementation of {@code AmazonTranscribeAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonTranscribeAsync extends AbstractAmazonTranscribe implements AmazonTranscribeAsync {

    protected AbstractAmazonTranscribeAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateVocabularyResult> createVocabularyAsync(CreateVocabularyRequest request) {

        return createVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVocabularyResult> createVocabularyAsync(CreateVocabularyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVocabularyRequest, CreateVocabularyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVocabularyFilterResult> createVocabularyFilterAsync(CreateVocabularyFilterRequest request) {

        return createVocabularyFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVocabularyFilterResult> createVocabularyFilterAsync(CreateVocabularyFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVocabularyFilterRequest, CreateVocabularyFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMedicalTranscriptionJobResult> deleteMedicalTranscriptionJobAsync(DeleteMedicalTranscriptionJobRequest request) {

        return deleteMedicalTranscriptionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMedicalTranscriptionJobResult> deleteMedicalTranscriptionJobAsync(DeleteMedicalTranscriptionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMedicalTranscriptionJobRequest, DeleteMedicalTranscriptionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTranscriptionJobResult> deleteTranscriptionJobAsync(DeleteTranscriptionJobRequest request) {

        return deleteTranscriptionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTranscriptionJobResult> deleteTranscriptionJobAsync(DeleteTranscriptionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTranscriptionJobRequest, DeleteTranscriptionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVocabularyResult> deleteVocabularyAsync(DeleteVocabularyRequest request) {

        return deleteVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVocabularyResult> deleteVocabularyAsync(DeleteVocabularyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVocabularyRequest, DeleteVocabularyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVocabularyFilterResult> deleteVocabularyFilterAsync(DeleteVocabularyFilterRequest request) {

        return deleteVocabularyFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVocabularyFilterResult> deleteVocabularyFilterAsync(DeleteVocabularyFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVocabularyFilterRequest, DeleteVocabularyFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMedicalTranscriptionJobResult> getMedicalTranscriptionJobAsync(GetMedicalTranscriptionJobRequest request) {

        return getMedicalTranscriptionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMedicalTranscriptionJobResult> getMedicalTranscriptionJobAsync(GetMedicalTranscriptionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMedicalTranscriptionJobRequest, GetMedicalTranscriptionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTranscriptionJobResult> getTranscriptionJobAsync(GetTranscriptionJobRequest request) {

        return getTranscriptionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTranscriptionJobResult> getTranscriptionJobAsync(GetTranscriptionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTranscriptionJobRequest, GetTranscriptionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetVocabularyResult> getVocabularyAsync(GetVocabularyRequest request) {

        return getVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVocabularyResult> getVocabularyAsync(GetVocabularyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetVocabularyRequest, GetVocabularyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetVocabularyFilterResult> getVocabularyFilterAsync(GetVocabularyFilterRequest request) {

        return getVocabularyFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVocabularyFilterResult> getVocabularyFilterAsync(GetVocabularyFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<GetVocabularyFilterRequest, GetVocabularyFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMedicalTranscriptionJobsResult> listMedicalTranscriptionJobsAsync(ListMedicalTranscriptionJobsRequest request) {

        return listMedicalTranscriptionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMedicalTranscriptionJobsResult> listMedicalTranscriptionJobsAsync(ListMedicalTranscriptionJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMedicalTranscriptionJobsRequest, ListMedicalTranscriptionJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTranscriptionJobsResult> listTranscriptionJobsAsync(ListTranscriptionJobsRequest request) {

        return listTranscriptionJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTranscriptionJobsResult> listTranscriptionJobsAsync(ListTranscriptionJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTranscriptionJobsRequest, ListTranscriptionJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListVocabulariesResult> listVocabulariesAsync(ListVocabulariesRequest request) {

        return listVocabulariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVocabulariesResult> listVocabulariesAsync(ListVocabulariesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListVocabulariesRequest, ListVocabulariesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListVocabularyFiltersResult> listVocabularyFiltersAsync(ListVocabularyFiltersRequest request) {

        return listVocabularyFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVocabularyFiltersResult> listVocabularyFiltersAsync(ListVocabularyFiltersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListVocabularyFiltersRequest, ListVocabularyFiltersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartMedicalTranscriptionJobResult> startMedicalTranscriptionJobAsync(StartMedicalTranscriptionJobRequest request) {

        return startMedicalTranscriptionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMedicalTranscriptionJobResult> startMedicalTranscriptionJobAsync(StartMedicalTranscriptionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartMedicalTranscriptionJobRequest, StartMedicalTranscriptionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartTranscriptionJobResult> startTranscriptionJobAsync(StartTranscriptionJobRequest request) {

        return startTranscriptionJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTranscriptionJobResult> startTranscriptionJobAsync(StartTranscriptionJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartTranscriptionJobRequest, StartTranscriptionJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateVocabularyResult> updateVocabularyAsync(UpdateVocabularyRequest request) {

        return updateVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVocabularyResult> updateVocabularyAsync(UpdateVocabularyRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateVocabularyRequest, UpdateVocabularyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateVocabularyFilterResult> updateVocabularyFilterAsync(UpdateVocabularyFilterRequest request) {

        return updateVocabularyFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVocabularyFilterResult> updateVocabularyFilterAsync(UpdateVocabularyFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateVocabularyFilterRequest, UpdateVocabularyFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
