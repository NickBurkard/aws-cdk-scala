package io.burkard.cdk.services.customerprofiles

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnIntegration {

  def apply(
    internalResourceId: String,
    flowDefinition: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.FlowDefinitionProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    uri: Option[String] = None,
    domainName: Option[String] = None,
    objectTypeName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.customerprofiles.CfnIntegration =
    software.amazon.awscdk.services.customerprofiles.CfnIntegration.Builder
      .create(stackCtx, internalResourceId)
      .flowDefinition(flowDefinition.orNull)
      .tags(tags.map(_.asJava).orNull)
      .uri(uri.orNull)
      .domainName(domainName.orNull)
      .objectTypeName(objectTypeName.orNull)
      .build()
}
