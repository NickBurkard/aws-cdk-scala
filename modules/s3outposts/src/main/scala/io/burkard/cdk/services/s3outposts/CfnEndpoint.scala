package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEndpoint {

  def apply(
    internalResourceId: String,
    securityGroupId: String,
    outpostId: String,
    subnetId: String,
    accessType: Option[String] = None,
    customerOwnedIpv4Pool: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3outposts.CfnEndpoint =
    software.amazon.awscdk.services.s3outposts.CfnEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .securityGroupId(securityGroupId)
      .outpostId(outpostId)
      .subnetId(subnetId)
      .accessType(accessType.orNull)
      .customerOwnedIpv4Pool(customerOwnedIpv4Pool.orNull)
      .build()
}
