package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeploymentPreferenceProperty {

  def apply(
    enabled: Option[Boolean] = None,
    alarms: Option[List[String]] = None,
    hooks: Option[List[String]] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .alarms(alarms.map(_.asJava).orNull)
      .hooks(hooks.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}
