package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SelectionCriteriaProperty {

  def apply(
    minStorageBytesPercentage: Option[Number] = None,
    maxDepth: Option[Number] = None,
    delimiter: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.SelectionCriteriaProperty.Builder)
      .minStorageBytesPercentage(minStorageBytesPercentage.orNull)
      .maxDepth(maxDepth.orNull)
      .delimiter(delimiter.orNull)
      .build()
}
