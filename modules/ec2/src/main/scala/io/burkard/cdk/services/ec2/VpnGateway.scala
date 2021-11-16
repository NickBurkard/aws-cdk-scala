package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpnGateway {

  def apply(
    internalResourceId: String,
    `type`: String,
    amazonSideAsn: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.VpnGateway =
    software.amazon.awscdk.services.ec2.VpnGateway.Builder
      .create(stackCtx, internalResourceId)
      .`type`(`type`)
      .amazonSideAsn(amazonSideAsn.orNull)
      .build()
}
