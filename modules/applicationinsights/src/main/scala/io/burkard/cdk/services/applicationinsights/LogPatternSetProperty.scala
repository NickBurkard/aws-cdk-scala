package io.burkard.cdk.services.applicationinsights

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogPatternSetProperty {

  def apply(
    logPatterns: Option[List[_]] = None,
    patternSetName: Option[String] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty.Builder)
      .logPatterns(logPatterns.map(_.asJava).orNull)
      .patternSetName(patternSetName.orNull)
      .build()
}
