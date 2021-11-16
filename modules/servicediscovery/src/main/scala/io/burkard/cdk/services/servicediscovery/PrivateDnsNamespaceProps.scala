package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrivateDnsNamespaceProps {

  def apply(
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    name: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps =
    (new software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps.Builder)
      .vpc(vpc)
      .name(name.orNull)
      .description(description.orNull)
      .build()
}
