package io.burkard.cdk.services.route53recoverycontrol

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRoutingControlProps {

  def apply(
    name: String,
    controlPanelArn: Option[String] = None,
    clusterArn: Option[String] = None
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps.Builder)
      .name(name)
      .controlPanelArn(controlPanelArn.orNull)
      .clusterArn(clusterArn.orNull)
      .build()
}
