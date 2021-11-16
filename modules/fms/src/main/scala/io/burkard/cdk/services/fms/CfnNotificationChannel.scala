package io.burkard.cdk.services.fms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNotificationChannel {

  def apply(
    internalResourceId: String,
    snsRoleName: String,
    snsTopicArn: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.fms.CfnNotificationChannel =
    software.amazon.awscdk.services.fms.CfnNotificationChannel.Builder
      .create(stackCtx, internalResourceId)
      .snsRoleName(snsRoleName)
      .snsTopicArn(snsTopicArn)
      .build()
}
