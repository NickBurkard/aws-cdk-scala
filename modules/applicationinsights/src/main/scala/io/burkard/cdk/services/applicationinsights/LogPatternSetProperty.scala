package io.burkard.cdk.services.applicationinsights

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogPatternSetProperty {

  def apply(
    logPatterns: List[_],
    patternSetName: String
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternSetProperty.Builder)
      .logPatterns(logPatterns.asJava)
      .patternSetName(patternSetName)
      .build()
}
