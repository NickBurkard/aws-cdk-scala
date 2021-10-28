package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCodeDeployBlueGreenApplication {

  def apply(
    ecsAttributes: Option[software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes] = None,
    target: Option[software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget] = None
  ): software.amazon.awscdk.CfnCodeDeployBlueGreenApplication =
    (new software.amazon.awscdk.CfnCodeDeployBlueGreenApplication.Builder)
      .ecsAttributes(ecsAttributes.orNull)
      .target(target.orNull)
      .build()
}
