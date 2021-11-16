package io.burkard.cdk.services.certificatemanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccountProps {

  def apply(
    expiryEventsConfiguration: software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty
  ): software.amazon.awscdk.services.certificatemanager.CfnAccountProps =
    (new software.amazon.awscdk.services.certificatemanager.CfnAccountProps.Builder)
      .expiryEventsConfiguration(expiryEventsConfiguration)
      .build()
}
