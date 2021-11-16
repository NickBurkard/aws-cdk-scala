package io.burkard.cdk.services.cloudformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomResource {

  def apply(
    internalResourceId: String,
    provider: software.amazon.awscdk.services.cloudformation.ICustomResourceProvider,
    resourceType: Option[String] = None,
    properties: Option[Map[String, _]] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudformation.CustomResource =
    software.amazon.awscdk.services.cloudformation.CustomResource.Builder
      .create(stackCtx, internalResourceId)
      .provider(provider)
      .resourceType(resourceType.orNull)
      .properties(properties.map(_.asJava).orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
