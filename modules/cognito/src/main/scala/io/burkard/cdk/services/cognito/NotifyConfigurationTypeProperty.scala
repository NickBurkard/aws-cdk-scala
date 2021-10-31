package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotifyConfigurationTypeProperty {

  def apply(
    replyTo: Option[String] = None,
    noActionEmail: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty] = None,
    blockEmail: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty] = None,
    sourceArn: Option[String] = None,
    mfaEmail: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty] = None,
    from: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty.Builder)
      .replyTo(replyTo.orNull)
      .noActionEmail(noActionEmail.orNull)
      .blockEmail(blockEmail.orNull)
      .sourceArn(sourceArn.orNull)
      .mfaEmail(mfaEmail.orNull)
      .from(from.orNull)
      .build()
}
