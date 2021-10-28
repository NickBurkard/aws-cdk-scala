package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCodeDeployLambdaAliasUpdate {

  def apply(
    applicationName: Option[String] = None,
    afterAllowTrafficHook: Option[String] = None,
    beforeAllowTrafficHook: Option[String] = None,
    deploymentGroupName: Option[String] = None
  ): software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate =
    (new software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate.Builder)
      .applicationName(applicationName.orNull)
      .afterAllowTrafficHook(afterAllowTrafficHook.orNull)
      .beforeAllowTrafficHook(beforeAllowTrafficHook.orNull)
      .deploymentGroupName(deploymentGroupName.orNull)
      .build()
}
