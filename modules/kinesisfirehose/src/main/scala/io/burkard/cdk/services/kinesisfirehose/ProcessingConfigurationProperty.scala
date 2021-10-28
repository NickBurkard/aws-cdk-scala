package io.burkard.cdk.services.kinesisfirehose

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProcessingConfigurationProperty {

  def apply(
    processors: Option[List[_]] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty.Builder)
      .processors(processors.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
