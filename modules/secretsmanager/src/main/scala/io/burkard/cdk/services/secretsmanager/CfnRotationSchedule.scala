package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRotationSchedule {

  def apply(
    internalResourceId: String,
    secretId: String,
    rotationRules: Option[software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty] = None,
    hostedRotationLambda: Option[software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty] = None,
    rotationLambdaArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule =
    software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.Builder
      .create(stackCtx, internalResourceId)
      .secretId(secretId)
      .rotationRules(rotationRules.orNull)
      .hostedRotationLambda(hostedRotationLambda.orNull)
      .rotationLambdaArn(rotationLambdaArn.orNull)
      .build()
}
