package io.burkard.cdk.services.customerprofiles

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIntegration {

  def apply(
    internalResourceId: String,
    domainName: String,
    objectTypeName: String,
    flowDefinition: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    uri: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.customerprofiles.CfnIntegration =
    software.amazon.awscdk.services.customerprofiles.CfnIntegration.Builder
      .create(stackCtx, internalResourceId)
      .domainName(domainName)
      .objectTypeName(objectTypeName)
      .flowDefinition(flowDefinition.orNull)
      .tags(tags.map(_.asJava).orNull)
      .uri(uri.orNull)
      .build()
}
