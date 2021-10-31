package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FilesLimitProperty {

  def apply(
    orderedBy: Option[String] = None,
    order: Option[String] = None,
    maxFiles: Option[Number] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty.Builder)
      .orderedBy(orderedBy.orNull)
      .order(order.orNull)
      .maxFiles(maxFiles.orNull)
      .build()
}
