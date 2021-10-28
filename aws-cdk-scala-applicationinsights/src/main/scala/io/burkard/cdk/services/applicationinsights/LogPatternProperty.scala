package io.burkard.cdk.services.applicationinsights

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogPatternProperty {

  def apply(
    pattern: Option[String] = None,
    rank: Option[Number] = None,
    patternName: Option[String] = None
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty.Builder)
      .pattern(pattern.orNull)
      .rank(rank.orNull)
      .patternName(patternName.orNull)
      .build()
}
