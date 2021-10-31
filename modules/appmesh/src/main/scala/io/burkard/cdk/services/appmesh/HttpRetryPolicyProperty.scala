package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpRetryPolicyProperty {

  def apply(
    tcpRetryEvents: Option[List[String]] = None,
    maxRetries: Option[Number] = None,
    perRetryTimeout: Option[software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty] = None,
    httpRetryEvents: Option[List[String]] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty.Builder)
      .tcpRetryEvents(tcpRetryEvents.map(_.asJava).orNull)
      .maxRetries(maxRetries.orNull)
      .perRetryTimeout(perRetryTimeout.orNull)
      .httpRetryEvents(httpRetryEvents.map(_.asJava).orNull)
      .build()
}
