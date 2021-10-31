package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FluentdLogDriverProps {

  def apply(
    subSecondPrecision: Option[Boolean] = None,
    tag: Option[String] = None,
    labels: Option[List[String]] = None,
    maxRetries: Option[Number] = None,
    address: Option[String] = None,
    retryWait: Option[software.amazon.awscdk.Duration] = None,
    env: Option[List[String]] = None,
    bufferLimit: Option[Number] = None,
    asyncConnect: Option[Boolean] = None,
    envRegex: Option[String] = None
  ): software.amazon.awscdk.services.ecs.FluentdLogDriverProps =
    (new software.amazon.awscdk.services.ecs.FluentdLogDriverProps.Builder)
      .subSecondPrecision(subSecondPrecision.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tag(tag.orNull)
      .labels(labels.map(_.asJava).orNull)
      .maxRetries(maxRetries.orNull)
      .address(address.orNull)
      .retryWait(retryWait.orNull)
      .env(env.map(_.asJava).orNull)
      .bufferLimit(bufferLimit.orNull)
      .asyncConnect(asyncConnect.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .envRegex(envRegex.orNull)
      .build()
}
