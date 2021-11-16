package io.burkard.cdk.services.applicationinsights

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WindowsEventProperty {

  def apply(
    eventName: String,
    logGroupName: String,
    eventLevels: List[String],
    patternSet: Option[String] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty.Builder)
      .eventName(eventName)
      .logGroupName(logGroupName)
      .eventLevels(eventLevels.asJava)
      .patternSet(patternSet.orNull)
      .build()
}
