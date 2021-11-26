package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetadataProperty {

  def apply(
    sourceArn: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty.Builder)
      .sourceArn(sourceArn.orNull)
      .build()
}
