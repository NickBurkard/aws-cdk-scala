package io.burkard.cdk.services.customerprofiles

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIntegrationProps {

  def apply(
    flowDefinition: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    uri: Option[String] = None,
    domainName: Option[String] = None,
    objectTypeName: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegrationProps.Builder)
      .flowDefinition(flowDefinition.orNull)
      .tags(tags.map(_.asJava).orNull)
      .uri(uri.orNull)
      .domainName(domainName.orNull)
      .objectTypeName(objectTypeName.orNull)
      .build()
}
