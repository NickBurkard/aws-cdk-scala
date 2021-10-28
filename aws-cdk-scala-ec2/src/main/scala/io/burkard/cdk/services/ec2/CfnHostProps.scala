package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnHostProps {

  def apply(
    availabilityZone: Option[String] = None,
    autoPlacement: Option[String] = None,
    instanceType: Option[String] = None,
    hostRecovery: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnHostProps =
    (new software.amazon.awscdk.services.ec2.CfnHostProps.Builder)
      .availabilityZone(availabilityZone.orNull)
      .autoPlacement(autoPlacement.orNull)
      .instanceType(instanceType.orNull)
      .hostRecovery(hostRecovery.orNull)
      .build()
}
