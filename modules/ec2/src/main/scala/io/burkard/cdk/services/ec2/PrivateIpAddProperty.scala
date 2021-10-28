package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PrivateIpAddProperty {

  def apply(
    privateIpAddress: Option[String] = None,
    primary: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.PrivateIpAddProperty.Builder)
      .privateIpAddress(privateIpAddress.orNull)
      .primary(primary.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
