package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataSourceConfigurationProperty {

  def apply(
    intendedUse: Option[String] = None
  ): software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty =
    (new software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty.Builder)
      .intendedUse(intendedUse.orNull)
      .build()
}
