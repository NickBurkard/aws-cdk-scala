package io.burkard.cdk.services.iotthingsgraph

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlowTemplate {

  def apply(
    internalResourceId: String,
    definition: software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty,
    compatibleNamespaceVersion: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate =
    software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.Builder
      .create(stackCtx, internalResourceId)
      .definition(definition)
      .compatibleNamespaceVersion(compatibleNamespaceVersion.orNull)
      .build()
}
