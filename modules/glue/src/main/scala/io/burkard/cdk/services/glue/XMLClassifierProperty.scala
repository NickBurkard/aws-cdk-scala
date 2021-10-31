package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object XMLClassifierProperty {

  def apply(
    name: Option[String] = None,
    rowTag: Option[String] = None,
    classification: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty =
    (new software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty.Builder)
      .name(name.orNull)
      .rowTag(rowTag.orNull)
      .classification(classification.orNull)
      .build()
}
