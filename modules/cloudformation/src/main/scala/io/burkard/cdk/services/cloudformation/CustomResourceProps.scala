package io.burkard.cdk.services.cloudformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomResourceProps {

  def apply(
    provider: Option[software.amazon.awscdk.services.cloudformation.ICustomResourceProvider] = None,
    resourceType: Option[String] = None,
    properties: Option[Map[String, _]] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.cloudformation.CustomResourceProps =
    (new software.amazon.awscdk.services.cloudformation.CustomResourceProps.Builder)
      .provider(provider.orNull)
      .resourceType(resourceType.orNull)
      .properties(properties.map(_.asJava).orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
