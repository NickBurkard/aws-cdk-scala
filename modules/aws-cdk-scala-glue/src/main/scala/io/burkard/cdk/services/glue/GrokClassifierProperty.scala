package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GrokClassifierProperty {

  def apply(
    name: Option[String] = None,
    customPatterns: Option[String] = None,
    grokPattern: Option[String] = None,
    classification: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty =
    (new software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty.Builder)
      .name(name.orNull)
      .customPatterns(customPatterns.orNull)
      .grokPattern(grokPattern.orNull)
      .classification(classification.orNull)
      .build()
}
