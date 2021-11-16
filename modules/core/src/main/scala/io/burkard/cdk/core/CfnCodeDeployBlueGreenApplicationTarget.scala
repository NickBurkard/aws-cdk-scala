package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCodeDeployBlueGreenApplicationTarget {

  def apply(
    `type`: String,
    logicalId: String
  ): software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget =
    (new software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget.Builder)
      .`type`(`type`)
      .logicalId(logicalId)
      .build()
}
