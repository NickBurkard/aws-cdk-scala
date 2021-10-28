package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BootstraplessSynthesizerProps {

  def apply(
    deployRoleArn: Option[String] = None,
    cloudFormationExecutionRoleArn: Option[String] = None
  ): software.amazon.awscdk.BootstraplessSynthesizerProps =
    (new software.amazon.awscdk.BootstraplessSynthesizerProps.Builder)
      .deployRoleArn(deployRoleArn.orNull)
      .cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn.orNull)
      .build()
}
