/*
 * Copyright 2021 Google LLC
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

package com.google.cloud.asset.v1p2beta1;

import com.google.api.core.BetaApi;
import com.google.cloud.asset.v1p2beta1.AssetServiceGrpc.AssetServiceImplBase;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockAssetServiceImpl extends AssetServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockAssetServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void createFeed(CreateFeedRequest request, StreamObserver<Feed> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Feed) {
      requests.add(request);
      responseObserver.onNext(((Feed) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateFeed, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Feed.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getFeed(GetFeedRequest request, StreamObserver<Feed> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Feed) {
      requests.add(request);
      responseObserver.onNext(((Feed) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetFeed, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Feed.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listFeeds(
      ListFeedsRequest request, StreamObserver<ListFeedsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListFeedsResponse) {
      requests.add(request);
      responseObserver.onNext(((ListFeedsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListFeeds, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListFeedsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void updateFeed(UpdateFeedRequest request, StreamObserver<Feed> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Feed) {
      requests.add(request);
      responseObserver.onNext(((Feed) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UpdateFeed, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Feed.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deleteFeed(DeleteFeedRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeleteFeed, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }
}
