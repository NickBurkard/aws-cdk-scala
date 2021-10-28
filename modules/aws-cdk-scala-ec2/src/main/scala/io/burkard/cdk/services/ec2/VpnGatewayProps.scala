package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpnGatewayProps {

  def apply(
    amazonSideAsn: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ec2.VpnGatewayProps =
    (new software.amazon.awscdk.services.ec2.VpnGatewayProps.Builder)
      .amazonSideAsn(amazonSideAsn.orNull)
      .`type`(`type`.orNull)
      .build()
}
