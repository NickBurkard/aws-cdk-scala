package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnsProperty {

  def apply(
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None,
    targetArn: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.SnsProperty.Builder)
      .payload(payload.orNull)
      .targetArn(targetArn.orNull)
      .build()
}
