package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrokClassifierProperty {

  def apply(
    grokPattern: String,
    classification: String,
    name: Option[String] = None,
    customPatterns: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty =
    (new software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty.Builder)
      .grokPattern(grokPattern)
      .classification(classification)
      .name(name.orNull)
      .customPatterns(customPatterns.orNull)
      .build()
}
