package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpEndpointConfigurationProperty {

  def apply(
    name: Option[String] = None,
    url: Option[String] = None,
    accessKey: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty.Builder)
      .name(name.orNull)
      .url(url.orNull)
      .accessKey(accessKey.orNull)
      .build()
}
