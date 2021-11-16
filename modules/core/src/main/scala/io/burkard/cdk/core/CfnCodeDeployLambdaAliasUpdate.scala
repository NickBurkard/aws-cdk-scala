package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCodeDeployLambdaAliasUpdate {

  def apply(
    applicationName: String,
    deploymentGroupName: String,
    afterAllowTrafficHook: Option[String] = None,
    beforeAllowTrafficHook: Option[String] = None
  ): software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate =
    (new software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate.Builder)
      .applicationName(applicationName)
      .deploymentGroupName(deploymentGroupName)
      .afterAllowTrafficHook(afterAllowTrafficHook.orNull)
      .beforeAllowTrafficHook(beforeAllowTrafficHook.orNull)
      .build()
}
