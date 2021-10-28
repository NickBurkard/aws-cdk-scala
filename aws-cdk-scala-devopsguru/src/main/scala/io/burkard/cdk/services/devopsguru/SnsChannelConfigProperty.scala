package io.burkard.cdk.services.devopsguru

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SnsChannelConfigProperty {

  def apply(
    topicArn: Option[String] = None
  ): software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty =
    (new software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty.Builder)
      .topicArn(topicArn.orNull)
      .build()
}
