package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutputFormatConfigurationProperty {

  def apply(
    serializer: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SerializerProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.OutputFormatConfigurationProperty.Builder)
      .serializer(serializer.orNull)
      .build()
}
