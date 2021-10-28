package io.burkard.cdk.services.servicecatalog

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
