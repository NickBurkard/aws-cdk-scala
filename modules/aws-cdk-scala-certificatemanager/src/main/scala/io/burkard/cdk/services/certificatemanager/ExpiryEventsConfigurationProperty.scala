package io.burkard.cdk.services.certificatemanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ExpiryEventsConfigurationProperty {

  def apply(
    daysBeforeExpiry: Option[Number] = None
  ): software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty =
    (new software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty.Builder)
      .daysBeforeExpiry(daysBeforeExpiry.orNull)
      .build()
}
