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

// [START asset_quickstart_analyze_iam_policy_longrunning_bigquery]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.asset.v1.AnalyzeIamPolicyLongrunningRequest;
import com.google.cloud.asset.v1.AnalyzeIamPolicyLongrunningResponse;
import com.google.cloud.asset.v1.AssetServiceClient;
import com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig;
import com.google.cloud.asset.v1.IamPolicyAnalysisOutputConfig.BigQueryDestination;
import com.google.cloud.asset.v1.IamPolicyAnalysisQuery;
import com.google.cloud.asset.v1.IamPolicyAnalysisQuery.Options;
import com.google.cloud.asset.v1.IamPolicyAnalysisQuery.ResourceSelector;

public class AnalyzeIamPolicyLongrunningBigqueryExample {

  public static void main(String[] args) throws Exception {
    // TODO(developer): Replace these variables before running the sample.
    String scope = "projects/<my-project-id>";
    String fullResourceName = "//cloudresourcemanager.googleapis.com/projects/<<my-project-id>>";
    String dataset = "projects/<my-project-id>/datasets/<my-dataset-id>";
    String tablePrefix = "<my-table-prefix>";
    analyzeIamPolicyLongrunning(scope, fullResourceName, dataset, tablePrefix);
  }

  // Analyzes accessible IAM policies that match a request.
  public static void analyzeIamPolicyLongrunning(
      String scope, String fullResourceName, String dataset, String tablePrefix) throws Exception {
    ResourceSelector resourceSelector =
        ResourceSelector.newBuilder().setFullResourceName(fullResourceName).build();
    Options options = Options.newBuilder().setExpandGroups(true).setOutputGroupEdges(true).build();
    IamPolicyAnalysisQuery query =
        IamPolicyAnalysisQuery.newBuilder()
            .setScope(scope)
            .setResourceSelector(resourceSelector)
            .setOptions(options)
            .build();

    BigQueryDestination bigQueryDestination =
        BigQueryDestination.newBuilder().setDataset(dataset).setTablePrefix(tablePrefix).build();
    IamPolicyAnalysisOutputConfig outputConfig =
        IamPolicyAnalysisOutputConfig.newBuilder()
            .setBigqueryDestination(bigQueryDestination)
            .build();

    AnalyzeIamPolicyLongrunningRequest request =
        AnalyzeIamPolicyLongrunningRequest.newBuilder()
            .setAnalysisQuery(query)
            .setOutputConfig(outputConfig)
            .build();

    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (AssetServiceClient client = AssetServiceClient.create()) {
      OperationFuture<AnalyzeIamPolicyLongrunningResponse, AnalyzeIamPolicyLongrunningRequest>
          future = client.analyzeIamPolicyLongrunningAsync(request);
      System.out.println("Analyze completed successfully:\n" + future.getMetadata().get());
    }
  }
}
// [END asset_quickstart_analyze_iam_policy_longrunning_bigquery]
