package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GrpcRetryPolicyProperty {

  def apply(
    grpcRetryEvents: Option[List[String]] = None,
    tcpRetryEvents: Option[List[String]] = None,
    maxRetries: Option[Number] = None,
    perRetryTimeout: Option[software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty] = None,
    httpRetryEvents: Option[List[String]] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRetryPolicyProperty.Builder)
      .grpcRetryEvents(grpcRetryEvents.map(_.asJava).orNull)
      .tcpRetryEvents(tcpRetryEvents.map(_.asJava).orNull)
      .maxRetries(maxRetries.orNull)
      .perRetryTimeout(perRetryTimeout.orNull)
      .httpRetryEvents(httpRetryEvents.map(_.asJava).orNull)
      .build()
}
