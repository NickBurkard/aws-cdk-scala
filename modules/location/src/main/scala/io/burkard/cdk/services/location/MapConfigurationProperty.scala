package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MapConfigurationProperty {

  def apply(
    style: Option[String] = None
  ): software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty =
    (new software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty.Builder)
      .style(style.orNull)
      .build()
}