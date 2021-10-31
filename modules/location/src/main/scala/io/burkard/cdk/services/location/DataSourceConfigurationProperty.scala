package io.burkard.cdk.services.location

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataSourceConfigurationProperty {

  def apply(
    intendedUse: Option[String] = None
  ): software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty =
    (new software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty.Builder)
      .intendedUse(intendedUse.orNull)
      .build()
}
