package io.burkard.cdk.services.iotthingsgraph

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlowTemplateProps {

  def apply(
    definition: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty,
    compatibleNamespaceVersion: Option[Number] = None
  ): software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps =
    (new software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps.Builder)
      .definition(definition)
      .compatibleNamespaceVersion(compatibleNamespaceVersion.orNull)
      .build()
}
