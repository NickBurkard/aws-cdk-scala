package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomResourceProps {

  def apply(
    resourceType: Option[String] = None,
    properties: Option[Map[String, _]] = None,
    serviceToken: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    pascalCaseProperties: Option[Boolean] = None
  ): software.amazon.awscdk.CustomResourceProps =
    (new software.amazon.awscdk.CustomResourceProps.Builder)
      .resourceType(resourceType.orNull)
      .properties(properties.map(_.asJava).orNull)
      .serviceToken(serviceToken.orNull)
      .removalPolicy(removalPolicy.orNull)
      .pascalCaseProperties(pascalCaseProperties.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}