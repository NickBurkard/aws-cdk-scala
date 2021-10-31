package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpRetryPolicy {

  def apply(
    tcpRetryEvents: Option[List[_ <: software.amazon.awscdk.services.appmesh.TcpRetryEvent]] = None,
    retryTimeout: Option[software.amazon.awscdk.Duration] = None,
    httpRetryEvents: Option[List[_ <: software.amazon.awscdk.services.appmesh.HttpRetryEvent]] = None,
    retryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.HttpRetryPolicy =
    (new software.amazon.awscdk.services.appmesh.HttpRetryPolicy.Builder)
      .tcpRetryEvents(tcpRetryEvents.map(_.asJava).orNull)
      .retryTimeout(retryTimeout.orNull)
      .httpRetryEvents(httpRetryEvents.map(_.asJava).orNull)
      .retryAttempts(retryAttempts.orNull)
      .build()
}
