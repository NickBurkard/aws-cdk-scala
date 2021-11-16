package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolUICustomizationAttachment {

  def apply(
    internalResourceId: String,
    userPoolId: String,
    clientId: String,
    css: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment =
    software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment.Builder
      .create(stackCtx, internalResourceId)
      .userPoolId(userPoolId)
      .clientId(clientId)
      .css(css.orNull)
      .build()
}
