package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolUICustomizationAttachmentProps {

  def apply(
    userPoolId: String,
    clientId: String,
    css: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps.Builder)
      .userPoolId(userPoolId)
      .clientId(clientId)
      .css(css.orNull)
      .build()
}
