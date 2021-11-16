package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationSetEventDestination {

  def apply(
    internalResourceId: String,
    configurationSetName: String,
    eventDestination: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination =
    software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.Builder
      .create(stackCtx, internalResourceId)
      .configurationSetName(configurationSetName)
      .eventDestination(eventDestination)
      .build()
}
