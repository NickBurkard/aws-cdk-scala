package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpRetryPolicy {

  def apply(
    retryTimeout: software.amazon.awscdk.Duration,
    retryAttempts: Number,
    tcpRetryEvents: Option[List[_ <: software.amazon.awscdk.services.appmesh.TcpRetryEvent]] = None,
    httpRetryEvents: Option[List[_ <: software.amazon.awscdk.services.appmesh.HttpRetryEvent]] = None
  ): software.amazon.awscdk.services.appmesh.HttpRetryPolicy =
    (new software.amazon.awscdk.services.appmesh.HttpRetryPolicy.Builder)
      .retryTimeout(retryTimeout)
      .retryAttempts(retryAttempts)
      .tcpRetryEvents(tcpRetryEvents.map(_.asJava).orNull)
      .httpRetryEvents(httpRetryEvents.map(_.asJava).orNull)
      .build()
}
