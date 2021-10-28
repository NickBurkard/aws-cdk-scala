package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PrivateDnsNamespace {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    description: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace =
    software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .description(description.orNull)
      .vpc(vpc.orNull)
      .build()
}
