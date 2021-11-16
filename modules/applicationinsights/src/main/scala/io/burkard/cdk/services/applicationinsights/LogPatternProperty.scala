package io.burkard.cdk.services.applicationinsights

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogPatternProperty {

  def apply(
    pattern: String,
    rank: Number,
    patternName: String
  ): software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty =
    (new software.amazon.awscdk.services.applicationinsights.CfnApplication.LogPatternProperty.Builder)
      .pattern(pattern)
      .rank(rank)
      .patternName(patternName)
      .build()
}
