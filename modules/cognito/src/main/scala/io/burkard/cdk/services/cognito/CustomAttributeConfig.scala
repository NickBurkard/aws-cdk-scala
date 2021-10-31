package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomAttributeConfig {

  def apply(
    mutable: Option[Boolean] = None,
    dataType: Option[String] = None,
    stringConstraints: Option[software.amazon.awscdk.services.cognito.StringAttributeConstraints] = None,
    numberConstraints: Option[software.amazon.awscdk.services.cognito.NumberAttributeConstraints] = None
  ): software.amazon.awscdk.services.cognito.CustomAttributeConfig =
    (new software.amazon.awscdk.services.cognito.CustomAttributeConfig.Builder)
      .mutable(mutable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dataType(dataType.orNull)
      .stringConstraints(stringConstraints.orNull)
      .numberConstraints(numberConstraints.orNull)
      .build()
}
