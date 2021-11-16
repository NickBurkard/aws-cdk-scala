package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudMapNamespaceOptions {

  def apply(
    name: String,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    `type`: Option[software.amazon.awscdk.services.servicediscovery.NamespaceType] = None
  ): software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions =
    (new software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions.Builder)
      .name(name)
      .vpc(vpc.orNull)
      .`type`(`type`.orNull)
      .build()
}
