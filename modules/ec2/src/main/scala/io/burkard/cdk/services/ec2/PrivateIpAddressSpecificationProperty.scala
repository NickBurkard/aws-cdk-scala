package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrivateIpAddressSpecificationProperty {

  def apply(
    privateIpAddress: String,
    primary: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.PrivateIpAddressSpecificationProperty.Builder)
      .privateIpAddress(privateIpAddress)
      .primary(primary.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
