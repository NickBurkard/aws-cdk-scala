package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeploymentPreferenceProperty {

  def apply(
    enabled: Boolean,
    `type`: String,
    alarms: Option[List[String]] = None,
    hooks: Option[List[String]] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty.Builder)
      .enabled(enabled)
      .`type`(`type`)
      .alarms(alarms.map(_.asJava).orNull)
      .hooks(hooks.map(_.asJava).orNull)
      .build()
}
