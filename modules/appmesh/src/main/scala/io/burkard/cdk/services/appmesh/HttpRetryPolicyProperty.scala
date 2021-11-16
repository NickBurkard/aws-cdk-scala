package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpRetryPolicyProperty {

  def apply(
    maxRetries: Number,
    perRetryTimeout: software.amazon.awscdk.services.appmesh.CfnRoute.DurationProperty,
    tcpRetryEvents: Option[List[String]] = None,
    httpRetryEvents: Option[List[String]] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.HttpRetryPolicyProperty.Builder)
      .maxRetries(maxRetries)
      .perRetryTimeout(perRetryTimeout)
      .tcpRetryEvents(tcpRetryEvents.map(_.asJava).orNull)
      .httpRetryEvents(httpRetryEvents.map(_.asJava).orNull)
      .build()
}
