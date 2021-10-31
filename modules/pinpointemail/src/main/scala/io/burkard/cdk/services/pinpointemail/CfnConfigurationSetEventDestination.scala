package io.burkard.cdk.services.pinpointemail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationSetEventDestination {

  def apply(
    internalResourceId: String,
    eventDestinationName: Option[String] = None,
    configurationSetName: Option[String] = None,
    eventDestination: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination =
    software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.Builder
      .create(stackCtx, internalResourceId)
      .eventDestinationName(eventDestinationName.orNull)
      .configurationSetName(configurationSetName.orNull)
      .eventDestination(eventDestination.orNull)
      .build()
}
