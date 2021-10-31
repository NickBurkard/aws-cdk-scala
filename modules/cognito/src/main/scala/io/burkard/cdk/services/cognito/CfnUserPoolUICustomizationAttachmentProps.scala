package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolUICustomizationAttachmentProps {

  def apply(
    userPoolId: Option[String] = None,
    clientId: Option[String] = None,
    css: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps.Builder)
      .userPoolId(userPoolId.orNull)
      .clientId(clientId.orNull)
      .css(css.orNull)
      .build()
}
