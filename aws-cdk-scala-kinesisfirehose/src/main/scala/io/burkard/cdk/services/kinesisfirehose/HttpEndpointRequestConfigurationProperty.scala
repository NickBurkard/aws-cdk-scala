package io.burkard.cdk.services.kinesisfirehose

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpEndpointRequestConfigurationProperty {

  def apply(
    commonAttributes: Option[List[_]] = None,
    contentEncoding: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty.Builder)
      .commonAttributes(commonAttributes.map(_.asJava).orNull)
      .contentEncoding(contentEncoding.orNull)
      .build()
}
