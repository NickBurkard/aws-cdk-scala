package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCodeDeployBlueGreenApplication {

  def apply(
    ecsAttributes: software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes,
    target: software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget
  ): software.amazon.awscdk.CfnCodeDeployBlueGreenApplication =
    (new software.amazon.awscdk.CfnCodeDeployBlueGreenApplication.Builder)
      .ecsAttributes(ecsAttributes)
      .target(target)
      .build()
}
