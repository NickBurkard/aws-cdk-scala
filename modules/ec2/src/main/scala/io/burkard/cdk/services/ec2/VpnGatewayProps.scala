package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpnGatewayProps {

  def apply(
    `type`: String,
    amazonSideAsn: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.VpnGatewayProps =
    (new software.amazon.awscdk.services.ec2.VpnGatewayProps.Builder)
      .`type`(`type`)
      .amazonSideAsn(amazonSideAsn.orNull)
      .build()
}
