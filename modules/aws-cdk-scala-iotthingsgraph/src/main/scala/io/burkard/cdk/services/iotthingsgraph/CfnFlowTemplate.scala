package io.burkard.cdk.services.iotthingsgraph

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFlowTemplate {

  def apply(
    internalResourceId: String,
    definition: Option[software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty] = None,
    compatibleNamespaceVersion: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate =
    software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.Builder
      .create(stackCtx, internalResourceId)
      .definition(definition.orNull)
      .compatibleNamespaceVersion(compatibleNamespaceVersion.orNull)
      .build()
}
