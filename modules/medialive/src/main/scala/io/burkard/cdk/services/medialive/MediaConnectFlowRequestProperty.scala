package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MediaConnectFlowRequestProperty {

  def apply(
    flowArn: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty =
    (new software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty.Builder)
      .flowArn(flowArn.orNull)
      .build()
}
