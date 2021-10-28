package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AutoRollbackConfig {

  def apply(
    stoppedDeployment: Option[Boolean] = None,
    deploymentInAlarm: Option[Boolean] = None,
    failedDeployment: Option[Boolean] = None
  ): software.amazon.awscdk.services.codedeploy.AutoRollbackConfig =
    (new software.amazon.awscdk.services.codedeploy.AutoRollbackConfig.Builder)
      .stoppedDeployment(stoppedDeployment.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deploymentInAlarm(deploymentInAlarm.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .failedDeployment(failedDeployment.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
