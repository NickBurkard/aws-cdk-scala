package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PayloadProperty {

  def apply(
    contentExpression: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty.Builder)
      .contentExpression(contentExpression.orNull)
      .`type`(`type`.orNull)
      .build()
}
