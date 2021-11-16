package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FilesLimitProperty {

  def apply(
    maxFiles: Number,
    orderedBy: Option[String] = None,
    order: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty.Builder)
      .maxFiles(maxFiles)
      .orderedBy(orderedBy.orNull)
      .order(order.orNull)
      .build()
}
