package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutputFileUriValueProperty {

  def apply(
    fileName: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.OutputFileUriValueProperty.Builder)
      .fileName(fileName.orNull)
      .build()
}
