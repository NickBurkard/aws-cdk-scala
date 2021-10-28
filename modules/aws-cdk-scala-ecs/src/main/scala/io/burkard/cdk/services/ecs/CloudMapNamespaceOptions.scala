package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudMapNamespaceOptions {

  def apply(
    name: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    `type`: Option[software.amazon.awscdk.services.servicediscovery.NamespaceType] = None
  ): software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions =
    (new software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions.Builder)
      .name(name.orNull)
      .vpc(vpc.orNull)
      .`type`(`type`.orNull)
      .build()
}
