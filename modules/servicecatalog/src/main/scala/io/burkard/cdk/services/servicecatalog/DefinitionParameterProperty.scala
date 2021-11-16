package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DefinitionParameterProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty =
    (new software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
