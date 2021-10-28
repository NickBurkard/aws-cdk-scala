package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserPoolUICustomizationAttachment {

  def apply(
    internalResourceId: String,
    userPoolId: Option[String] = None,
    clientId: Option[String] = None,
    css: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment =
    software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment.Builder
      .create(stackCtx, internalResourceId)
      .userPoolId(userPoolId.orNull)
      .clientId(clientId.orNull)
      .css(css.orNull)
      .build()
}
