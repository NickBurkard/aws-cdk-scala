package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrivateDnsNamespace {

  def apply(
    internalResourceId: String,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    name: Option[String] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace =
    software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace.Builder
      .create(stackCtx, internalResourceId)
      .vpc(vpc)
      .name(name.orNull)
      .description(description.orNull)
      .build()
}
