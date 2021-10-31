package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EmailConfigurationProperty {

  def apply(
    sourceArn: Option[String] = None,
    configurationSet: Option[String] = None,
    replyToEmailAddress: Option[String] = None,
    from: Option[String] = None,
    emailSendingAccount: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.EmailConfigurationProperty.Builder)
      .sourceArn(sourceArn.orNull)
      .configurationSet(configurationSet.orNull)
      .replyToEmailAddress(replyToEmailAddress.orNull)
      .from(from.orNull)
      .emailSendingAccount(emailSendingAccount.orNull)
      .build()
}
