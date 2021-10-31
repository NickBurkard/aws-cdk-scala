package io.burkard.cdk.services.kinesisfirehose

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
