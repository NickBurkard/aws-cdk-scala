package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileFormatConfigurationProperty {

  def apply(
    jsonConfiguration: Option[software.amazon.awscdk.services.iotanalytics.CfnDatastore.JsonConfigurationProperty] = None,
    parquetConfiguration: Option[software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty.Builder)
      .jsonConfiguration(jsonConfiguration.orNull)
      .parquetConfiguration(parquetConfiguration.orNull)
      .build()
}
