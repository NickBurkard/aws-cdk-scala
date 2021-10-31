package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcRetryPolicy {

  def apply(
    grpcRetryEvents: Option[List[_ <: software.amazon.awscdk.services.appmesh.GrpcRetryEvent]] = None,
    tcpRetryEvents: Option[List[_ <: software.amazon.awscdk.services.appmesh.TcpRetryEvent]] = None,
    retryTimeout: Option[software.amazon.awscdk.Duration] = None,
    httpRetryEvents: Option[List[_ <: software.amazon.awscdk.services.appmesh.HttpRetryEvent]] = None,
    retryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.GrpcRetryPolicy =
    (new software.amazon.awscdk.services.appmesh.GrpcRetryPolicy.Builder)
      .grpcRetryEvents(grpcRetryEvents.map(_.asJava).orNull)
      .tcpRetryEvents(tcpRetryEvents.map(_.asJava).orNull)
      .retryTimeout(retryTimeout.orNull)
      .httpRetryEvents(httpRetryEvents.map(_.asJava).orNull)
      .retryAttempts(retryAttempts.orNull)
      .build()
}
