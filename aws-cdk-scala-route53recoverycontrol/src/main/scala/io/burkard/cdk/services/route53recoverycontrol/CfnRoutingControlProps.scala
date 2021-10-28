package io.burkard.cdk.services.route53recoverycontrol

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRoutingControlProps {

  def apply(
    name: Option[String] = None,
    controlPanelArn: Option[String] = None,
    clusterArn: Option[String] = None
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps.Builder)
      .name(name.orNull)
      .controlPanelArn(controlPanelArn.orNull)
      .clusterArn(clusterArn.orNull)
      .build()
}
