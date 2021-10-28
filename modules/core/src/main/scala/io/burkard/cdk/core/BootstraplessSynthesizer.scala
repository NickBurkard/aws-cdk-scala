package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BootstraplessSynthesizer {

  def apply(
    deployRoleArn: Option[String] = None,
    cloudFormationExecutionRoleArn: Option[String] = None
  ): software.amazon.awscdk.BootstraplessSynthesizer =
    software.amazon.awscdk.BootstraplessSynthesizer.Builder
      .create()
      .deployRoleArn(deployRoleArn.orNull)
      .cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn.orNull)
      .build()
}
