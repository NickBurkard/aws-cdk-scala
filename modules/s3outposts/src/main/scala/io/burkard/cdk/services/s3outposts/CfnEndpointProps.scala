package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEndpointProps {

  def apply(
    securityGroupId: String,
    outpostId: String,
    subnetId: String,
    accessType: Option[String] = None,
    customerOwnedIpv4Pool: Option[String] = None
  ): software.amazon.awscdk.services.s3outposts.CfnEndpointProps =
    (new software.amazon.awscdk.services.s3outposts.CfnEndpointProps.Builder)
      .securityGroupId(securityGroupId)
      .outpostId(outpostId)
      .subnetId(subnetId)
      .accessType(accessType.orNull)
      .customerOwnedIpv4Pool(customerOwnedIpv4Pool.orNull)
      .build()
}
