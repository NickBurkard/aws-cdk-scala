package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnHost {

  def apply(
    internalResourceId: String,
    availabilityZone: Option[String] = None,
    autoPlacement: Option[String] = None,
    instanceType: Option[String] = None,
    hostRecovery: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnHost =
    software.amazon.awscdk.services.ec2.CfnHost.Builder
      .create(stackCtx, internalResourceId)
      .availabilityZone(availabilityZone.orNull)
      .autoPlacement(autoPlacement.orNull)
      .instanceType(instanceType.orNull)
      .hostRecovery(hostRecovery.orNull)
      .build()
}
