package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RunCommandParametersProperty {

  def apply(
    runCommandTargets: List[_]
  ): software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty =
    (new software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty.Builder)
      .runCommandTargets(runCommandTargets.asJava)
      .build()
}
