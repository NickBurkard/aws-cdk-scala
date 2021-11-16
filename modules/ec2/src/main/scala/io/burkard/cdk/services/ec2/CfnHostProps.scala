package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnHostProps {

  def apply(
    availabilityZone: String,
    instanceType: String,
    autoPlacement: Option[String] = None,
    hostRecovery: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnHostProps =
    (new software.amazon.awscdk.services.ec2.CfnHostProps.Builder)
      .availabilityZone(availabilityZone)
      .instanceType(instanceType)
      .autoPlacement(autoPlacement.orNull)
      .hostRecovery(hostRecovery.orNull)
      .build()
}
