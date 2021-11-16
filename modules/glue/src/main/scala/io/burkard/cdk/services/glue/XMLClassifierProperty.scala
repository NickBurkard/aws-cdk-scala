package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object XMLClassifierProperty {

  def apply(
    rowTag: String,
    classification: String,
    name: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty =
    (new software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty.Builder)
      .rowTag(rowTag)
      .classification(classification)
      .name(name.orNull)
      .build()
}
