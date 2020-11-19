/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.asset;

// [START asset_quickstart_analyze_iam_policy_longrunning_gcs]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.cloud.asset.v1.AnalyzeIamPolicyLongrunningRequest;
import com.google.cloud.asset.v1.AnalyzeIamPolicyLongrunningResponse;
import com.google.cloud.asset.v1.AssetServiceClient;
import com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig;
import com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig.GcsDestination;
import com.google.cloud.asset.v1.IamPolicyAnalysisQuery;
import com.google.cloud.asset.v1.IamPolicyAnalysisQuery.Options;
import com.google.cloud.asset.v1.IamPolicyAnalysisQuery.ResourceSelector;
import java.io.IOException;

public class AnalyzeIamPolicyLongrunningGcsExample {

  // Analyzes accessible IAM policies that match a request.
  public static void analyzeIamPolicyLongrunning(
      String scope, String fullResourceName, String uri) {
    AnalyzeIamPolicyLongrunningRequest request =
        AnalyzeIamPolicyLongrunningRequest.newBuilder()
            .setAnalysisQuery(
                IamPolicyAnalysisQuery.newBuilder()
                    .setScope(scope)
                    .setResourceSelector(
                        ResourceSelector.newBuilder().setFullResourceName(fullResourceName).build())
                    .setOptions(
                        Options.newBuilder()
                            .setExpandGroups(true)
                            .setOutputGroupEdges(true)
                            .build())
                    .build())
            .setOutputConfig(
                IamPolicyAnalysisOutputConfig.newBuilder()
                    .setGcsDestination(GcsDestination.newBuilder().setUri(uri).build())
                    .build())
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (AssetServiceClient client = AssetServiceClient.create()) {
      OperationFuture<AnalyzeIamPolicyLongrunningResponse, AnalyzeIamPolicyLongrunningRequest>
          future = client.analyzeIamPolicyLongrunningAsync(request);
      System.out.println("Analyze completed successfully:\n" + future.getMetadata().get());
    } catch (IOException e) {
      System.out.println(String.format("Failed to create client:%n%s", e.toString()));
    } catch (InvalidArgumentException e) {
      System.out.println(String.format("Invalid request:%n%s", e.toString()));
    } catch (ApiException e) {
      System.out.println(
          String.format("Error during AnalyzeIamPolicyLongrunning:%n%s", e.toString()));
    } catch (Exception e) {
      System.out.println(String.format("Unknown error:%n%s", e.toString()));
    }
  }
}
// [END asset_quickstart_analyze_iam_policy_longrunning_gcs]
