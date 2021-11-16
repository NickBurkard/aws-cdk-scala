package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationSetEventDestinationProps {

  def apply(
    eventDestinationName: String,
    configurationSetName: String,
    eventDestination: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps.Builder)
      .eventDestinationName(eventDestinationName)
      .configurationSetName(configurationSetName)
      .eventDestination(eventDestination.orNull)
      .build()
}
