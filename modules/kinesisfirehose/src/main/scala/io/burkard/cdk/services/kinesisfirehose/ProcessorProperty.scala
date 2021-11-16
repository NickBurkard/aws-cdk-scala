package io.burkard.cdk.services.kinesisfirehose

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProcessorProperty {

  def apply(
    `type`: String,
    parameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessorProperty.Builder)
      .`type`(`type`)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
