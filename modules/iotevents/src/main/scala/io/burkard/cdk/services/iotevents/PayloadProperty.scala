package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PayloadProperty {

  def apply(
    contentExpression: String,
    `type`: String
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty.Builder)
      .contentExpression(contentExpression)
      .`type`(`type`)
      .build()
}
