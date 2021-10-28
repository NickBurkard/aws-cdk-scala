package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PrivateDnsNamespaceProps {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  ): software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps =
    (new software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .vpc(vpc.orNull)
      .build()
}
