package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomResource {

  def apply(
    internalResourceId: String,
    resourceType: Option[String] = None,
    properties: Option[Map[String, _]] = None,
    serviceToken: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    pascalCaseProperties: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CustomResource =
    software.amazon.awscdk.CustomResource.Builder
      .create(stackCtx, internalResourceId)
      .resourceType(resourceType.orNull)
      .properties(properties.map(_.asJava).orNull)
      .serviceToken(serviceToken.orNull)
      .removalPolicy(removalPolicy.orNull)
      .pascalCaseProperties(pascalCaseProperties.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
