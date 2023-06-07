/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.asset.v1p1beta1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.asset.v1p1beta1.stub.AssetServiceStub;
import com.google.cloud.asset.v1p1beta1.stub.AssetServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Asset service definition.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
 *   String scope = "scope109264468";
 *   String query = "query107944136";
 *   List<String> assetTypes = new ArrayList<>();
 *   for (StandardResourceMetadata element :
 *       assetServiceClient.searchAllResources(scope, query, assetTypes).iterateAll()) {
 *     // doThingsWith(element);
 *   }
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AssetServiceClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of AssetServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AssetServiceSettings assetServiceSettings =
 *     AssetServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AssetServiceClient assetServiceClient = AssetServiceClient.create(assetServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AssetServiceSettings assetServiceSettings =
 *     AssetServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AssetServiceClient assetServiceClient = AssetServiceClient.create(assetServiceSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AssetServiceSettings assetServiceSettings = AssetServiceSettings.newHttpJsonBuilder().build();
 * AssetServiceClient assetServiceClient = AssetServiceClient.create(assetServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class AssetServiceClient implements BackgroundResource {
  private final AssetServiceSettings settings;
  private final AssetServiceStub stub;

  /** Constructs an instance of AssetServiceClient with default settings. */
  public static final AssetServiceClient create() throws IOException {
    return create(AssetServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AssetServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AssetServiceClient create(AssetServiceSettings settings) throws IOException {
    return new AssetServiceClient(settings);
  }

  /**
   * Constructs an instance of AssetServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(AssetServiceSettings).
   */
  public static final AssetServiceClient create(AssetServiceStub stub) {
    return new AssetServiceClient(stub);
  }

  /**
   * Constructs an instance of AssetServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected AssetServiceClient(AssetServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AssetServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected AssetServiceClient(AssetServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AssetServiceSettings getSettings() {
    return settings;
  }

  public AssetServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches all the resources within a given accessible Resource Manager scope
   * (project/folder/organization). This RPC gives callers especially administrators the ability to
   * search all the resources within a scope, even if they don't have `.get` permission of all the
   * resources. Callers should have `cloud.assets.SearchAllResources` permission on the requested
   * scope, otherwise the request will be rejected.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
   *   String scope = "scope109264468";
   *   String query = "query107944136";
   *   List<String> assetTypes = new ArrayList<>();
   *   for (StandardResourceMetadata element :
   *       assetServiceClient.searchAllResources(scope, query, assetTypes).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param scope Required. The relative name of an asset. The search is limited to the resources
   *     within the `scope`. The allowed value must be:
   *     <ul>
   *       <li>Organization number (such as "organizations/123")
   *       <li>Folder number (such as "folders/1234")
   *       <li>Project number (such as "projects/12345")
   *       <li>Project ID (such as "projects/abc")
   *     </ul>
   *
   * @param query Optional. The query statement.
   * @param assetTypes Optional. A list of asset types that this request searches for. If empty, it
   *     will search all the supported asset types.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchAllResourcesPagedResponse searchAllResources(
      String scope, String query, List<String> assetTypes) {
    SearchAllResourcesRequest request =
        SearchAllResourcesRequest.newBuilder()
            .setScope(scope)
            .setQuery(query)
            .addAllAssetTypes(assetTypes)
            .build();
    return searchAllResources(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches all the resources within a given accessible Resource Manager scope
   * (project/folder/organization). This RPC gives callers especially administrators the ability to
   * search all the resources within a scope, even if they don't have `.get` permission of all the
   * resources. Callers should have `cloud.assets.SearchAllResources` permission on the requested
   * scope, otherwise the request will be rejected.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
   *   SearchAllResourcesRequest request =
   *       SearchAllResourcesRequest.newBuilder()
   *           .setScope("scope109264468")
   *           .setQuery("query107944136")
   *           .addAllAssetTypes(new ArrayList<String>())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (StandardResourceMetadata element :
   *       assetServiceClient.searchAllResources(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchAllResourcesPagedResponse searchAllResources(
      SearchAllResourcesRequest request) {
    return searchAllResourcesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches all the resources within a given accessible Resource Manager scope
   * (project/folder/organization). This RPC gives callers especially administrators the ability to
   * search all the resources within a scope, even if they don't have `.get` permission of all the
   * resources. Callers should have `cloud.assets.SearchAllResources` permission on the requested
   * scope, otherwise the request will be rejected.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
   *   SearchAllResourcesRequest request =
   *       SearchAllResourcesRequest.newBuilder()
   *           .setScope("scope109264468")
   *           .setQuery("query107944136")
   *           .addAllAssetTypes(new ArrayList<String>())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<StandardResourceMetadata> future =
   *       assetServiceClient.searchAllResourcesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (StandardResourceMetadata element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<SearchAllResourcesRequest, SearchAllResourcesPagedResponse>
      searchAllResourcesPagedCallable() {
    return stub.searchAllResourcesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches all the resources within a given accessible Resource Manager scope
   * (project/folder/organization). This RPC gives callers especially administrators the ability to
   * search all the resources within a scope, even if they don't have `.get` permission of all the
   * resources. Callers should have `cloud.assets.SearchAllResources` permission on the requested
   * scope, otherwise the request will be rejected.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
   *   SearchAllResourcesRequest request =
   *       SearchAllResourcesRequest.newBuilder()
   *           .setScope("scope109264468")
   *           .setQuery("query107944136")
   *           .addAllAssetTypes(new ArrayList<String>())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     SearchAllResourcesResponse response =
   *         assetServiceClient.searchAllResourcesCallable().call(request);
   *     for (StandardResourceMetadata element : response.getResultsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<SearchAllResourcesRequest, SearchAllResourcesResponse>
      searchAllResourcesCallable() {
    return stub.searchAllResourcesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches all the IAM policies within a given accessible Resource Manager scope
   * (project/folder/organization). This RPC gives callers especially administrators the ability to
   * search all the IAM policies within a scope, even if they don't have `.getIamPolicy` permission
   * of all the IAM policies. Callers should have `cloud.assets.SearchAllIamPolicies` permission on
   * the requested scope, otherwise the request will be rejected.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
   *   String scope = "scope109264468";
   *   String query = "query107944136";
   *   for (IamPolicySearchResult element :
   *       assetServiceClient.searchAllIamPolicies(scope, query).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param scope Required. The relative name of an asset. The search is limited to the resources
   *     within the `scope`. The allowed value must be:
   *     <ul>
   *       <li>Organization number (such as "organizations/123")
   *       <li>Folder number (such as "folders/1234")
   *       <li>Project number (such as "projects/12345")
   *       <li>Project ID (such as "projects/abc")
   *     </ul>
   *
   * @param query Optional. The query statement. Examples:
   *     <ul>
   *       <li>"policy:myuser{@literal @}mydomain.com"
   *       <li>"policy:(myuser{@literal @}mydomain.com viewer)"
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchAllIamPoliciesPagedResponse searchAllIamPolicies(String scope, String query) {
    SearchAllIamPoliciesRequest request =
        SearchAllIamPoliciesRequest.newBuilder().setScope(scope).setQuery(query).build();
    return searchAllIamPolicies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches all the IAM policies within a given accessible Resource Manager scope
   * (project/folder/organization). This RPC gives callers especially administrators the ability to
   * search all the IAM policies within a scope, even if they don't have `.getIamPolicy` permission
   * of all the IAM policies. Callers should have `cloud.assets.SearchAllIamPolicies` permission on
   * the requested scope, otherwise the request will be rejected.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
   *   SearchAllIamPoliciesRequest request =
   *       SearchAllIamPoliciesRequest.newBuilder()
   *           .setScope("scope109264468")
   *           .setQuery("query107944136")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (IamPolicySearchResult element :
   *       assetServiceClient.searchAllIamPolicies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchAllIamPoliciesPagedResponse searchAllIamPolicies(
      SearchAllIamPoliciesRequest request) {
    return searchAllIamPoliciesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches all the IAM policies within a given accessible Resource Manager scope
   * (project/folder/organization). This RPC gives callers especially administrators the ability to
   * search all the IAM policies within a scope, even if they don't have `.getIamPolicy` permission
   * of all the IAM policies. Callers should have `cloud.assets.SearchAllIamPolicies` permission on
   * the requested scope, otherwise the request will be rejected.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
   *   SearchAllIamPoliciesRequest request =
   *       SearchAllIamPoliciesRequest.newBuilder()
   *           .setScope("scope109264468")
   *           .setQuery("query107944136")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<IamPolicySearchResult> future =
   *       assetServiceClient.searchAllIamPoliciesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (IamPolicySearchResult element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<SearchAllIamPoliciesRequest, SearchAllIamPoliciesPagedResponse>
      searchAllIamPoliciesPagedCallable() {
    return stub.searchAllIamPoliciesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches all the IAM policies within a given accessible Resource Manager scope
   * (project/folder/organization). This RPC gives callers especially administrators the ability to
   * search all the IAM policies within a scope, even if they don't have `.getIamPolicy` permission
   * of all the IAM policies. Callers should have `cloud.assets.SearchAllIamPolicies` permission on
   * the requested scope, otherwise the request will be rejected.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
   *   SearchAllIamPoliciesRequest request =
   *       SearchAllIamPoliciesRequest.newBuilder()
   *           .setScope("scope109264468")
   *           .setQuery("query107944136")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     SearchAllIamPoliciesResponse response =
   *         assetServiceClient.searchAllIamPoliciesCallable().call(request);
   *     for (IamPolicySearchResult element : response.getResultsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<SearchAllIamPoliciesRequest, SearchAllIamPoliciesResponse>
      searchAllIamPoliciesCallable() {
    return stub.searchAllIamPoliciesCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class SearchAllResourcesPagedResponse
      extends AbstractPagedListResponse<
          SearchAllResourcesRequest,
          SearchAllResourcesResponse,
          StandardResourceMetadata,
          SearchAllResourcesPage,
          SearchAllResourcesFixedSizeCollection> {

    public static ApiFuture<SearchAllResourcesPagedResponse> createAsync(
        PageContext<SearchAllResourcesRequest, SearchAllResourcesResponse, StandardResourceMetadata>
            context,
        ApiFuture<SearchAllResourcesResponse> futureResponse) {
      ApiFuture<SearchAllResourcesPage> futurePage =
          SearchAllResourcesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new SearchAllResourcesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private SearchAllResourcesPagedResponse(SearchAllResourcesPage page) {
      super(page, SearchAllResourcesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class SearchAllResourcesPage
      extends AbstractPage<
          SearchAllResourcesRequest,
          SearchAllResourcesResponse,
          StandardResourceMetadata,
          SearchAllResourcesPage> {

    private SearchAllResourcesPage(
        PageContext<SearchAllResourcesRequest, SearchAllResourcesResponse, StandardResourceMetadata>
            context,
        SearchAllResourcesResponse response) {
      super(context, response);
    }

    private static SearchAllResourcesPage createEmptyPage() {
      return new SearchAllResourcesPage(null, null);
    }

    @Override
    protected SearchAllResourcesPage createPage(
        PageContext<SearchAllResourcesRequest, SearchAllResourcesResponse, StandardResourceMetadata>
            context,
        SearchAllResourcesResponse response) {
      return new SearchAllResourcesPage(context, response);
    }

    @Override
    public ApiFuture<SearchAllResourcesPage> createPageAsync(
        PageContext<SearchAllResourcesRequest, SearchAllResourcesResponse, StandardResourceMetadata>
            context,
        ApiFuture<SearchAllResourcesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class SearchAllResourcesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          SearchAllResourcesRequest,
          SearchAllResourcesResponse,
          StandardResourceMetadata,
          SearchAllResourcesPage,
          SearchAllResourcesFixedSizeCollection> {

    private SearchAllResourcesFixedSizeCollection(
        List<SearchAllResourcesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static SearchAllResourcesFixedSizeCollection createEmptyCollection() {
      return new SearchAllResourcesFixedSizeCollection(null, 0);
    }

    @Override
    protected SearchAllResourcesFixedSizeCollection createCollection(
        List<SearchAllResourcesPage> pages, int collectionSize) {
      return new SearchAllResourcesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class SearchAllIamPoliciesPagedResponse
      extends AbstractPagedListResponse<
          SearchAllIamPoliciesRequest,
          SearchAllIamPoliciesResponse,
          IamPolicySearchResult,
          SearchAllIamPoliciesPage,
          SearchAllIamPoliciesFixedSizeCollection> {

    public static ApiFuture<SearchAllIamPoliciesPagedResponse> createAsync(
        PageContext<
                SearchAllIamPoliciesRequest, SearchAllIamPoliciesResponse, IamPolicySearchResult>
            context,
        ApiFuture<SearchAllIamPoliciesResponse> futureResponse) {
      ApiFuture<SearchAllIamPoliciesPage> futurePage =
          SearchAllIamPoliciesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new SearchAllIamPoliciesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private SearchAllIamPoliciesPagedResponse(SearchAllIamPoliciesPage page) {
      super(page, SearchAllIamPoliciesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class SearchAllIamPoliciesPage
      extends AbstractPage<
          SearchAllIamPoliciesRequest,
          SearchAllIamPoliciesResponse,
          IamPolicySearchResult,
          SearchAllIamPoliciesPage> {

    private SearchAllIamPoliciesPage(
        PageContext<
                SearchAllIamPoliciesRequest, SearchAllIamPoliciesResponse, IamPolicySearchResult>
            context,
        SearchAllIamPoliciesResponse response) {
      super(context, response);
    }

    private static SearchAllIamPoliciesPage createEmptyPage() {
      return new SearchAllIamPoliciesPage(null, null);
    }

    @Override
    protected SearchAllIamPoliciesPage createPage(
        PageContext<
                SearchAllIamPoliciesRequest, SearchAllIamPoliciesResponse, IamPolicySearchResult>
            context,
        SearchAllIamPoliciesResponse response) {
      return new SearchAllIamPoliciesPage(context, response);
    }

    @Override
    public ApiFuture<SearchAllIamPoliciesPage> createPageAsync(
        PageContext<
                SearchAllIamPoliciesRequest, SearchAllIamPoliciesResponse, IamPolicySearchResult>
            context,
        ApiFuture<SearchAllIamPoliciesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class SearchAllIamPoliciesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          SearchAllIamPoliciesRequest,
          SearchAllIamPoliciesResponse,
          IamPolicySearchResult,
          SearchAllIamPoliciesPage,
          SearchAllIamPoliciesFixedSizeCollection> {

    private SearchAllIamPoliciesFixedSizeCollection(
        List<SearchAllIamPoliciesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static SearchAllIamPoliciesFixedSizeCollection createEmptyCollection() {
      return new SearchAllIamPoliciesFixedSizeCollection(null, 0);
    }

    @Override
    protected SearchAllIamPoliciesFixedSizeCollection createCollection(
        List<SearchAllIamPoliciesPage> pages, int collectionSize) {
      return new SearchAllIamPoliciesFixedSizeCollection(pages, collectionSize);
    }
  }
}
