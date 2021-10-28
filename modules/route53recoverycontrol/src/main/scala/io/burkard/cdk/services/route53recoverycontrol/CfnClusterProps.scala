package io.burkard.cdk.services.route53recoverycontrol

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClusterProps {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps.Builder)
      .name(name.orNull)
      .build()
}
