package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaProperty {

  def apply(
    functionArn: String,
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.LambdaProperty.Builder)
      .functionArn(functionArn)
      .payload(payload.orNull)
      .build()
}
