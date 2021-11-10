package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RelationalDatabaseParameterProperty {

  def apply(
    applyType: Option[String] = None,
    isModifiable: Option[Boolean] = None,
    parameterValue: Option[String] = None,
    parameterName: Option[String] = None,
    description: Option[String] = None,
    allowedValues: Option[String] = None,
    dataType: Option[String] = None,
    applyMethod: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty =
    (new software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty.Builder)
      .applyType(applyType.orNull)
      .isModifiable(isModifiable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .parameterValue(parameterValue.orNull)
      .parameterName(parameterName.orNull)
      .description(description.orNull)
      .allowedValues(allowedValues.orNull)
      .dataType(dataType.orNull)
      .applyMethod(applyMethod.orNull)
      .build()
}
