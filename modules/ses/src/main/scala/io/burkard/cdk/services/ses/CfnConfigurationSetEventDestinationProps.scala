package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationSetEventDestinationProps {

  def apply(
    configurationSetName: String,
    eventDestination: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty
  ): software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps =
    (new software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps.Builder)
      .configurationSetName(configurationSetName)
      .eventDestination(eventDestination)
      .build()
}
