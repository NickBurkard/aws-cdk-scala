package io.burkard.cdk.services.certificatemanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAccountProps {

  def apply(
    expiryEventsConfiguration: Option[software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty] = None
  ): software.amazon.awscdk.services.certificatemanager.CfnAccountProps =
    (new software.amazon.awscdk.services.certificatemanager.CfnAccountProps.Builder)
      .expiryEventsConfiguration(expiryEventsConfiguration.orNull)
      .build()
}
