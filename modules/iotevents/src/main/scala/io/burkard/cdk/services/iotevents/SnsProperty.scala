package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnsProperty {

  def apply(
    targetArn: String,
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty.Builder)
      .targetArn(targetArn)
      .payload(payload.orNull)
      .build()
}
