package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AttributeTypeProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolUser.AttributeTypeProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
