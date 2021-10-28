package io.burkard.cdk.services.fms

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNotificationChannel {

  def apply(
    internalResourceId: String,
    snsRoleName: Option[String] = None,
    snsTopicArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.fms.CfnNotificationChannel =
    software.amazon.awscdk.services.fms.CfnNotificationChannel.Builder
      .create(stackCtx, internalResourceId)
      .snsRoleName(snsRoleName.orNull)
      .snsTopicArn(snsTopicArn.orNull)
      .build()
}