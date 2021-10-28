package io.burkard.cdk.services.route53recoverycontrol

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnControlPanel {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    clusterArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel =
    software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .clusterArn(clusterArn.orNull)
      .build()
}
