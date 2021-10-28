package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PrivateIpAddressSpecificationProperty {

  def apply(
    privateIpAddress: Option[String] = None,
    primary: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnNetworkInterface.PrivateIpAddressSpecificationProperty.Builder)
      .privateIpAddress(privateIpAddress.orNull)
      .primary(primary.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
