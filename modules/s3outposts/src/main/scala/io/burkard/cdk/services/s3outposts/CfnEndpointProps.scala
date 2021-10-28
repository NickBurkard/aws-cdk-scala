package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEndpointProps {

  def apply(
    accessType: Option[String] = None,
    securityGroupId: Option[String] = None,
    outpostId: Option[String] = None,
    subnetId: Option[String] = None,
    customerOwnedIpv4Pool: Option[String] = None
  ): software.amazon.awscdk.services.s3outposts.CfnEndpointProps =
    (new software.amazon.awscdk.services.s3outposts.CfnEndpointProps.Builder)
      .accessType(accessType.orNull)
      .securityGroupId(securityGroupId.orNull)
      .outpostId(outpostId.orNull)
      .subnetId(subnetId.orNull)
      .customerOwnedIpv4Pool(customerOwnedIpv4Pool.orNull)
      .build()
}
