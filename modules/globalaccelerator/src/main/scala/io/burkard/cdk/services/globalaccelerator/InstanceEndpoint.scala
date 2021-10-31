package io.burkard.cdk.services.globalaccelerator

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceEndpoint {

  def apply(
    instance: software.amazon.awscdk.services.ec2.IInstance,
    weight: Option[Number] = None,
    preserveClientIp: Option[Boolean] = None
  ): software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint =
    software.amazon.awscdk.services.globalaccelerator.endpoints.InstanceEndpoint.Builder
      .create(instance)
      .weight(weight.orNull)
      .preserveClientIp(preserveClientIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
