package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCodeDeployBlueGreenApplicationTarget {

  def apply(
    `type`: Option[String] = None,
    logicalId: Option[String] = None
  ): software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget =
    (new software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget.Builder)
      .`type`(`type`.orNull)
      .logicalId(logicalId.orNull)
      .build()
}
