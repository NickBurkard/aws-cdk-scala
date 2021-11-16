package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcRetryPolicyProperty {

  def apply(
    maxRetries: Number,
    perRetryTimeout: software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty,
    grpcRetryEvents: Option[List[String]] = None,
    tcpRetryEvents: Option[List[String]] = None,
    httpRetryEvents: Option[List[String]] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty.Builder)
      .maxRetries(maxRetries)
      .perRetryTimeout(perRetryTimeout)
      .grpcRetryEvents(grpcRetryEvents.map(_.asJava).orNull)
      .tcpRetryEvents(tcpRetryEvents.map(_.asJava).orNull)
      .httpRetryEvents(httpRetryEvents.map(_.asJava).orNull)
      .build()
}
