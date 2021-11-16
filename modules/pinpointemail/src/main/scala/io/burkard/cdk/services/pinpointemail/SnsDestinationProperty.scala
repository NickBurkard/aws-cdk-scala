package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnsDestinationProperty {

  def apply(
    topicArn: String
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty.Builder)
      .topicArn(topicArn)
      .build()
}
