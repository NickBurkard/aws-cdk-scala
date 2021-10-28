package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRotationScheduleProps {

  def apply(
    rotationRules: Option[software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty] = None,
    hostedRotationLambda: Option[software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.HostedRotationLambdaProperty] = None,
    secretId: Option[String] = None,
    rotationLambdaArn: Option[String] = None
  ): software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps =
    (new software.amazon.awscdk.services.secretsmanager.CfnRotationScheduleProps.Builder)
      .rotationRules(rotationRules.orNull)
      .hostedRotationLambda(hostedRotationLambda.orNull)
      .secretId(secretId.orNull)
      .rotationLambdaArn(rotationLambdaArn.orNull)
      .build()
}
