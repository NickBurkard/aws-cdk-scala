package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpnGateway {

  def apply(
    internalResourceId: String,
    amazonSideAsn: Option[Number] = None,
    `type`: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.VpnGateway =
    software.amazon.awscdk.services.ec2.VpnGateway.Builder
      .create(stackCtx, internalResourceId)
      .amazonSideAsn(amazonSideAsn.orNull)
      .`type`(`type`.orNull)
      .build()
}
