package io.burkard.cdk.services.codedeploy

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaDeploymentGroupProps {

  def apply(
    application: Option[software.amazon.awscdk.services.codedeploy.ILambdaApplication] = None,
    ignorePollAlarmsFailure: Option[Boolean] = None,
    autoRollback: Option[software.amazon.awscdk.services.codedeploy.AutoRollbackConfig] = None,
    preHook: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    deploymentGroupName: Option[String] = None,
    postHook: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    deploymentConfig: Option[software.amazon.awscdk.services.codedeploy.ILambdaDeploymentConfig] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    alarms: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.IAlarm]] = None,
    alias: Option[software.amazon.awscdk.services.lambda.Alias] = None
  ): software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps =
    (new software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps.Builder)
      .application(application.orNull)
      .ignorePollAlarmsFailure(ignorePollAlarmsFailure.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .autoRollback(autoRollback.orNull)
      .preHook(preHook.orNull)
      .deploymentGroupName(deploymentGroupName.orNull)
      .postHook(postHook.orNull)
      .deploymentConfig(deploymentConfig.orNull)
      .role(role.orNull)
      .alarms(alarms.map(_.asJava).orNull)
      .alias(alias.orNull)
      .build()
}
