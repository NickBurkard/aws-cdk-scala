package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataFormatConversionConfigurationProperty {

  def apply(
    enabled: Option[Boolean] = None,
    outputFormatConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty] = None,
    schemaConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SchemaConfigurationProperty] = None,
    inputFormatConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.InputFormatConfigurationProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .outputFormatConfiguration(outputFormatConfiguration.orNull)
      .schemaConfiguration(schemaConfiguration.orNull)
      .inputFormatConfiguration(inputFormatConfiguration.orNull)
      .build()
}
