package io.burkard.cdk.services.kinesisfirehose

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
