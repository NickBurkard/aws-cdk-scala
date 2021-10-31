package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PinpointDestinationProperty {

  def apply(
    applicationArn: Option[String] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty.Builder)
      .applicationArn(applicationArn.orNull)
      .build()
}
