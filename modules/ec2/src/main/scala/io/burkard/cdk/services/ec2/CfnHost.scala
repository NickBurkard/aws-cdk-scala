package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHost {

  def apply(
    internalResourceId: String,
    availabilityZone: String,
    instanceType: String,
    autoPlacement: Option[String] = None,
    hostRecovery: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnHost =
    software.amazon.awscdk.services.ec2.CfnHost.Builder
      .create(stackCtx, internalResourceId)
      .availabilityZone(availabilityZone)
      .instanceType(instanceType)
      .autoPlacement(autoPlacement.orNull)
      .hostRecovery(hostRecovery.orNull)
      .build()
}
