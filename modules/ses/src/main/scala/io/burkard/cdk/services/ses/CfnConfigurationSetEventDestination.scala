package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationSetEventDestination {

  def apply(
    internalResourceId: String,
    configurationSetName: Option[String] = None,
    eventDestination: Option[software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination =
    software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.Builder
      .create(stackCtx, internalResourceId)
      .configurationSetName(configurationSetName.orNull)
      .eventDestination(eventDestination.orNull)
      .build()
}
