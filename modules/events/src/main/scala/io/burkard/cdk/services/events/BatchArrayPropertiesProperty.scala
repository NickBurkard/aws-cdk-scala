package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BatchArrayPropertiesProperty {

  def apply(
    size: Option[Number] = None
  ): software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty =
    (new software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty.Builder)
      .size(size.orNull)
      .build()
}
