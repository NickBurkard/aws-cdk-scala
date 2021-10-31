package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUpdatePolicy {

  def apply(
    enableVersionUpgrade: Option[Boolean] = None,
    autoScalingReplacingUpdate: Option[software.amazon.awscdk.CfnAutoScalingReplacingUpdate] = None,
    autoScalingScheduledAction: Option[software.amazon.awscdk.CfnAutoScalingScheduledAction] = None,
    codeDeployLambdaAliasUpdate: Option[software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate] = None,
    autoScalingRollingUpdate: Option[software.amazon.awscdk.CfnAutoScalingRollingUpdate] = None,
    useOnlineResharding: Option[Boolean] = None
  ): software.amazon.awscdk.CfnUpdatePolicy =
    (new software.amazon.awscdk.CfnUpdatePolicy.Builder)
      .enableVersionUpgrade(enableVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .autoScalingReplacingUpdate(autoScalingReplacingUpdate.orNull)
      .autoScalingScheduledAction(autoScalingScheduledAction.orNull)
      .codeDeployLambdaAliasUpdate(codeDeployLambdaAliasUpdate.orNull)
      .autoScalingRollingUpdate(autoScalingRollingUpdate.orNull)
      .useOnlineResharding(useOnlineResharding.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
