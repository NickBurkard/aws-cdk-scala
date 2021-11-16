package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JsonClassifierProperty {

  def apply(
    jsonPath: String,
    name: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty =
    (new software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty.Builder)
      .jsonPath(jsonPath)
      .name(name.orNull)
      .build()
}
