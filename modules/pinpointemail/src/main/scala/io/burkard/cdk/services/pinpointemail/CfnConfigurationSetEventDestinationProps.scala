package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationSetEventDestinationProps {

  def apply(
    eventDestinationName: Option[String] = None,
    configurationSetName: Option[String] = None,
    eventDestination: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps.Builder)
      .eventDestinationName(eventDestinationName.orNull)
      .configurationSetName(configurationSetName.orNull)
      .eventDestination(eventDestination.orNull)
      .build()
}
