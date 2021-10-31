package io.burkard.cdk.services.devopsguru

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationChannelConfigProperty {

  def apply(
    sns: Option[software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty] = None
  ): software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty =
    (new software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty.Builder)
      .sns(sns.orNull)
      .build()
}
