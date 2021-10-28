package io.burkard.cdk.services.codedeploy

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AlarmConfigurationProperty {

  def apply(
    enabled: Option[Boolean] = None,
    ignorePollAlarmFailure: Option[Boolean] = None,
    alarms: Option[List[_]] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AlarmConfigurationProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ignorePollAlarmFailure(ignorePollAlarmFailure.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .alarms(alarms.map(_.asJava).orNull)
      .build()
}
