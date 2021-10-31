package io.burkard.cdk.services.codedeploy

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AutoRollbackConfigurationProperty {

  def apply(
    enabled: Option[Boolean] = None,
    events: Option[List[String]] = None
  ): software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty =
    (new software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup.AutoRollbackConfigurationProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .events(events.map(_.asJava).orNull)
      .build()
}
