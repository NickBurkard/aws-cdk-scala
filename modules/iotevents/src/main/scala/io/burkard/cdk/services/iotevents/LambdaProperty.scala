package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaProperty {

  def apply(
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None,
    functionArn: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty.Builder)
      .payload(payload.orNull)
      .functionArn(functionArn.orNull)
      .build()
}
