package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DefinitionParameterProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty =
    (new software.amazon.awscdk.services.servicecatalog.CfnServiceAction.DefinitionParameterProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
