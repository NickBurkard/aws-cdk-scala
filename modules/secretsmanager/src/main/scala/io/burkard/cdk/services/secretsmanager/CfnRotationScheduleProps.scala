package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRotationScheduleProps {

  def apply(
    secretId: String,
    rotationRules: Option[software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty] = None,
    hostedRotationLambda: Option[software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty] = None,
    rotationLambdaArn: Option[String] = None
  ): software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps =
    (new software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.Builder)
      .secretId(secretId)
      .rotationRules(rotationRules.orNull)
      .hostedRotationLambda(hostedRotationLambda.orNull)
      .rotationLambdaArn(rotationLambdaArn.orNull)
      .build()
}
