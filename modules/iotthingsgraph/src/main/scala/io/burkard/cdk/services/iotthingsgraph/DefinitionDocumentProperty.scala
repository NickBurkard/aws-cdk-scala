package io.burkard.cdk.services.iotthingsgraph

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DefinitionDocumentProperty {

  def apply(
    text: String,
    language: String
  ): software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty =
    (new software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty.Builder)
      .text(text)
      .language(language)
      .build()
}
