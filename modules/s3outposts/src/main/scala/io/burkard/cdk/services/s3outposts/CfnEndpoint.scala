package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEndpoint {

  def apply(
    internalResourceId: String,
    accessType: Option[String] = None,
    securityGroupId: Option[String] = None,
    outpostId: Option[String] = None,
    subnetId: Option[String] = None,
    customerOwnedIpv4Pool: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3outposts.CfnEndpoint =
    software.amazon.awscdk.services.s3outposts.CfnEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .accessType(accessType.orNull)
      .securityGroupId(securityGroupId.orNull)
      .outpostId(outpostId.orNull)
      .subnetId(subnetId.orNull)
      .customerOwnedIpv4Pool(customerOwnedIpv4Pool.orNull)
      .build()
}
