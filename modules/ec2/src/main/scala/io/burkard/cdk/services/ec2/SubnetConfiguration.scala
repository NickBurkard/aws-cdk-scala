package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubnetConfiguration {

  def apply(
    reserved: Option[Boolean] = None,
    name: Option[String] = None,
    cidrMask: Option[Number] = None,
    subnetType: Option[software.amazon.awscdk.services.ec2.SubnetType] = None
  ): software.amazon.awscdk.services.ec2.SubnetConfiguration =
    (new software.amazon.awscdk.services.ec2.SubnetConfiguration.Builder)
      .reserved(reserved.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .name(name.orNull)
      .cidrMask(cidrMask.orNull)
      .subnetType(subnetType.orNull)
      .build()
}
