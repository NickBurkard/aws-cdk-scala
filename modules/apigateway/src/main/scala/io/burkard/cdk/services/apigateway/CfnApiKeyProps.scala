package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApiKeyProps {

  def apply(
    name: Option[String] = None,
    generateDistinctId: Option[Boolean] = None,
    enabled: Option[Boolean] = None,
    customerId: Option[String] = None,
    stageKeys: Option[List[_]] = None,
    value: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.apigateway.CfnApiKeyProps =
    (new software.amazon.awscdk.services.apigateway.CfnApiKeyProps.Builder)
      .name(name.orNull)
      .generateDistinctId(generateDistinctId.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .customerId(customerId.orNull)
      .stageKeys(stageKeys.map(_.asJava).orNull)
      .value(value.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
