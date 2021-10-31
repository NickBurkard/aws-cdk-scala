package io.burkard.cdk.services.applicationinsights

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WindowsEventProperty {

  def apply(
    eventName: Option[String] = None,
    patternSet: Option[String] = None,
    logGroupName: Option[String] = None,
    eventLevels: Option[List[String]] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.WindowsEventProperty.Builder)
      .eventName(eventName.orNull)
      .patternSet(patternSet.orNull)
      .logGroupName(logGroupName.orNull)
      .eventLevels(eventLevels.map(_.asJava).orNull)
      .build()
}
