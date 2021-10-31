package io.burkard.cdk.services.iotthingsgraph

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DefinitionDocumentProperty {

  def apply(
    text: Option[String] = None,
    language: Option[String] = None
  ): software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty =
    (new software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate.DefinitionDocumentProperty.Builder)
      .text(text.orNull)
      .language(language.orNull)
      .build()
}
