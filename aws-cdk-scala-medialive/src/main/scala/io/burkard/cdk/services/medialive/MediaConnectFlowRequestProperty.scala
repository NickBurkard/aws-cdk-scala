package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MediaConnectFlowRequestProperty {

  def apply(
    flowArn: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty =
    (new software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty.Builder)
      .flowArn(flowArn.orNull)
      .build()
}
