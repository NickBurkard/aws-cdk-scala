package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RunCommandParametersProperty {

  def apply(
    runCommandTargets: Option[List[_]] = None
  ): software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty =
    (new software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty.Builder)
      .runCommandTargets(runCommandTargets.map(_.asJava).orNull)
      .build()
}
