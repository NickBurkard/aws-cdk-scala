package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GelfLogDriverProps {

  def apply(
    address: String,
    tcpMaxReconnect: Option[Number] = None,
    tcpReconnectDelay: Option[software.amazon.awscdk.Duration] = None,
    tag: Option[String] = None,
    labels: Option[List[String]] = None,
    envRegex: Option[String] = None,
    env: Option[List[String]] = None,
    compressionLevel: Option[Number] = None,
    compressionType: Option[software.amazon.awscdk.services.ecs.GelfCompressionType] = None
  ): software.amazon.awscdk.services.ecs.GelfLogDriverProps =
    (new software.amazon.awscdk.services.ecs.GelfLogDriverProps.Builder)
      .address(address)
      .tcpMaxReconnect(tcpMaxReconnect.orNull)
      .tcpReconnectDelay(tcpReconnectDelay.orNull)
      .tag(tag.orNull)
      .labels(labels.map(_.asJava).orNull)
      .envRegex(envRegex.orNull)
      .env(env.map(_.asJava).orNull)
      .compressionLevel(compressionLevel.orNull)
      .compressionType(compressionType.orNull)
      .build()
}
