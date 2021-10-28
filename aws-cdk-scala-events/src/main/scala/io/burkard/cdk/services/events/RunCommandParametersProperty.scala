package io.burkard.cdk.services.events

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RunCommandParametersProperty {

  def apply(
    runCommandTargets: Option[List[_]] = None
  ): software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty =
    (new software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty.Builder)
      .runCommandTargets(runCommandTargets.map(_.asJava).orNull)
      .build()
}
