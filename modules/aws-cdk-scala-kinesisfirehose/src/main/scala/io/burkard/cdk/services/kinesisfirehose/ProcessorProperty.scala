package io.burkard.cdk.services.kinesisfirehose

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProcessorProperty {

  def apply(
    `type`: Option[String] = None,
    parameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty.Builder)
      .`type`(`type`.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
